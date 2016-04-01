import org.scalatest.FunSpec
import org.scalatest.Matchers._

class SnapshotReplacerSpec extends FunSpec {

  describe("The snapshot replacer") {

    it("should replace the snapshot version with the final one") {
      val greeting = SnapshotReplacer.hello()
      greeting shouldBe "hello"
    }
  }
}

object SnapshotReplacer {

  def hello() = "hello"
}

