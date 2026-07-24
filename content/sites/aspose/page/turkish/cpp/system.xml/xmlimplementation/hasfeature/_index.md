---
title: "System::Xml::XmlImplementation::HasFeature yöntemi"
linktitle: "HasFeature"
second_title: "Aspose.Page için C++"
description: "System::Xml::XmlImplementation::HasFeature yöntemi. C++'da Document Object Model (DOM) uygulamasının belirli bir özelliği destekleyip desteklemediğini test eder."
type: docs
weight: 300
url: /tr/cpp/system.xml/xmlimplementation/hasfeature/
---
## XmlImplementation::HasFeature method


Document [Object](../../../system/object/) Model (DOM) uygulamasının belirli bir özelliği destekleyip desteklemediğini test eder.

```cpp
bool System::Xml::XmlImplementation::HasFeature(const String &strFeature, const String &strVersion)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| strFeature | const String\& | Test edilecek özelliğin paket adı. Bu ad büyük/küçük harfe duyarlı değildir. |
| strVersion | const String\& | Bu, test edilecek paket adının sürüm numarasıdır. Sürüm belirtilmemişse (**nullptr**), özelliğin herhangi bir sürümünü desteklemek, yöntemin **true** döndürmesine neden olur. |

### ReturnValue

**true** if the feature is implemented in the specified version; otherwise, **false**.
## Açıklamalar



Aşağıdaki tablo, **HasFeature**'in **true** döndürmesine neden olan kombinasyonları gösterir. |||
|-|-|
| strFeature | strVersion |
| XML | 1.0 |
| XML | 2.0 |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [XmlImplementation](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
