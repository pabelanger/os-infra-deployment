os-infra-deployment
===================
This project is an example deployment to get a continous integration
environment up and running quickly.

Quick Start
------------

Install playbook dependencies

    tox -evenv -- ansible-galaxy install -p playbooks/roles -r playbooks/requirements.yaml

Basic full deployment

    tox -eansible-functional

Testing environment

    tox -evenv -- ansible-playbook -i playbooks/inventory playbooks/site.yaml
