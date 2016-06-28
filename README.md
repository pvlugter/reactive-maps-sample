# Reactive Maps sample

This is a version of the [Reactive Maps template][template] configured for Lightbend Monitoring and actor metrics via JMX.

Reactive Maps can be run as an Akka cluster with multiple frontend and backend nodes. There are three roles: `frontend`, `backend-summary`, `backend-region`.

Reactive Maps is configured to run via [ConductR]. See the activator tutorial for more information.

To run Reactive Maps manually, as multiple clustered nodes, first build the distribution:

```
sbt stage
```

Start a seed node, with just the `frontend` role:

```
target/universal/stage/bin/reactive-maps -Dakka.cluster.roles.1=frontend
```

Start a `backend-summary` node:

```
target/universal/stage/bin/reactive-maps -Dakka.remote.netty.tcp.port=0 -Dakka.cluster.roles.1=backend-summary -main backend.Main
```

This process will join the Akka cluster seed node started above.

Start a `backend-region` node:

```
target/universal/stage/bin/reactive-maps -Dakka.remote.netty.tcp.port=0 -Dakka.cluster.roles.1=backend-region -main backend.Main
```

There will now be a 3 node Akka cluster for Reactive Maps. The web frontend will be available at [http://localhost:9000](http://localhost:9000).

Additional `backend-summary` and `backend-region` nodes can be added as above. Additional `frontend` nodes can also be created using the following pattern:

```
target/universal/stage/bin/reactive-maps -Dhttp.port=9001 -Dakka.remote.netty.tcp.port=0 -Dakka.cluster.roles.1=frontend -Dpidfile.path=frontend2.pid
```

Where the Play frontend is configured with a new HTTP port and PID file.

[ConductR]: http://conductr.lightbend.com
[template]: https://www.lightbend.com/activator/template/reactive-maps
