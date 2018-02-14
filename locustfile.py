from locust import HttpLocust, TaskSet

def get_ip(l):
    l.client.get("/ip")

class UserBehavior(TaskSet):
    tasks = {get_ip: 1}

    def on_start(self):
        get_ip(self)

class APIUser(HttpLocust):
    task_set = UserBehavior
    min_wait = 5000
    max_wait = 9000