/*
 * Copyright 2015 HM Revenue & Customs
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package uk.gov.hmrc.accessibility

import org.scalatest._

class AccessibilityToolSpec extends WordSpec with ShouldMatchers {

  "AccessibilityTool.runAccessibilityReport" should {
    
    "produce a predefined report" in {

      val file = maybeWriteResourceToTmp("sample-page-1.html")
      val report = AccessibilityTool.runAccessibilityReport(file)
      val expected = resourceAsBufferedSource("/sample-report-1.txt").mkString
      
      report shouldBe expected
    }
  }
}
