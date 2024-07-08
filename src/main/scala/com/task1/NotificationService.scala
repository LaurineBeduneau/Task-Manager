import com.typesafe.scalalogging.LazyLogging
import courier.{Envelope, Mailer, Text}

class NotificationService {
  private val mailer = Mailer("smtp.example.com").auth(true).as("username", "password")

  def sendEmailNotification(to: String, subject: String, body: String): Unit = {
    val email = Envelope.from("sender@example.com")
      .to(to)
      .subject(subject)
      .content(Text(body))
    mailer(email)
  }
}