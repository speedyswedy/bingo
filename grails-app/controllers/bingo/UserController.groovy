package bingo

class UserController {

    def index() {
    }

    def list() {
        User.findAll()
    }
}
