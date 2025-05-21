# 基于微信小程序的人工智能医学减重平台（医生端后端）

## 项目简介
本项目基于UniApp开发微信小程序客户端，结合Spring Boot后端和Python AI服务，打造医学减重辅助平台。配备基于若依框架的Web医生端，实现医生与用户的交互管理。后端及医生Web端部署于华为云云服务器，保障系统稳定与高可用。

## 技术栈
- **前端（微信小程序）**  
  - UniApp（Vue3）  
  - 微信开发者工具
- **后端**  
  - Spring Boot (Java)  
  - Python（Flask/FastAPI）AI大语言模型服务
- **医生端Web管理系统**  
  - 若依框架（RuoYi: Spring Boot + Vue.js）
- **数据库**  
  - MySQL
- **缓存与消息**  
  - Redis（华为云Redis）  

- **云平台**  
  - 华为云ECS（后端、AI服务、医生端Web部署）  
  - 华为云RDS数据库  
  - 华为云安全组、负载均衡及云监控

## 开发与部署环境

### 本地开发环境
- HBuilderX（UniApp前端开发）
- 微信开发者工具（小程序调试）
- JDK 11+（Spring Boot后端）
- IntelliJ IDEA 或其他IDE（Java开发）
- Python 3.8+（AI服务开发）
- Node.js + npm/yarn（若依医生端前端依赖）
- MySQL 本地/云端数据库

### 华为云部署环境
- **弹性云服务器（ECS）**  
  - 部署Spring Boot后端、Python AI服务、若依医生端Web应用
  - 配置操作系统（CentOS）、Java环境、Python环境、Nginx代理
- **华为云RDS数据库**  
  - 关系型数据库服务，存储用户、医生信息及业务数据


## 系统架构概览

```mermaid  
flowchart TD  
  WX[微信小程序客户端（UniApp）] -->|HTTP请求| Nginx[Nginx代理（ECS）]  
  WebDoc[医生Web端（若依框架）] -->|HTTP请求| Nginx  
  Nginx --> SpringBoot[Spring Boot后端服务（ECS）]  
  SpringBoot --> PythonAI[Python AI服务（ECS）]  
  SpringBoot --> MySQL[(华为云数据库)]  
  SpringBoot --> Redis[华为云Redis缓存]  
