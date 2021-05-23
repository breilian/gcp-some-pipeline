# gcp-some-pipeline

This is test project to look at and exercise with google cloud services.

Repository contains:
- source code for simple *CRUD* service (Spring Boot)
- build pipeline script *cloudbuild.yaml* 

Service has deployed on App Engine: https://some-pipeline.appspot.com/api

Build pipeline is triggered by master commits.

Build step *test* includes unit tests and sonarcube analisis (sonarcloud.io).

Moreover introduced (but is not configured completely) steps *save_* and *restore_cache* : https://github.com/GoogleCloudPlatform/cloud-builders-community/tree/master/cache
