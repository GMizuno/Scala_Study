package part2

object Enums extends App {

  enum Permissions {
    case READ, WRITE, EXECUTE, NONE

    def openDocument(): Unit =
      if (this == READ) println("openning document")
      else println("reading not allowed")

  }

  val somePermissions: Permissions = Permissions.READ

  enum PermissionWithBits(bits: Int) {
    case READ extends PermissionWithBits(4)
    case WRITE extends PermissionWithBits(2)
    case EXECUTE extends PermissionWithBits(1)
    case NONE extends PermissionWithBits(0)
  }

  object PermissionWithBits {
    def fromBits(bits: Int): PermissionWithBits =
      PermissionWithBits.NONE
  }

  somePermissions.openDocument()

}

