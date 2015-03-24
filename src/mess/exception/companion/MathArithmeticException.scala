package mess.exception.companion

import mess.exception.MathArithmeticException

object MathArithmeticException {

  def create(msg: String) {
    new MathArithmeticException(msg,"")
  }

  def create(msg: String, cause: String) {
    new MathArithmeticException(msg, cause)
  }

}
