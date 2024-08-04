# Resource monitoring system using TIG stack

This repository provides an example of setting up a monitoring system for a simple architecture, including:

- Spring Boot app
- MongoDB 
- Elasticsearch 
- nginx 

The monitoring stack is implemented using the TIG Stack (Telegraf, InfluxDB, and Grafana).

## Quick Start

To start the monitoring stack, run the following command:
```
docker-compose up
```

##  Experiments and results

The system load was generated using ApacheBench with commands from [script](load_test.sh).

### Summary dashboard

![summary](results/summary.png)

### System

![system_1](results/system_1.png)
![system_2](results/system_2.png)

### Network

![network](results/network.png)

### Docker

![docker_1](results/docker_1.png)
![docker_2](results/docker_2.png)

### nginx

![nginx](results/nginx.png)

### MongoDB

![mongo](results/mongo.png)

### Elasticsearch

![elastic](results/elastic.png)
