---
title: "System::Xml::XmlImplementation::HasFeature yöntemi"
linktitle: "HasFeature"
second_title: "Aspose.Font için C++"
description: "System::Xml::XmlImplementation::HasFeature yöntemi. Belge Nesne Modeli (DOM) uygulamasının C++'ta belirli bir özelliği uygulayıp uygulamadığını test eder."
type: docs
weight: 300
url: /tr/cpp/system.xml/xmlimplementation/hasfeature/
---
## XmlImplementation::HasFeature method


Belge [Object](../../../system/object/) Modeli (DOM) uygulamasının belirli bir özelliği uygulayıp uygulamadığını test eder.

```cpp
bool System::Xml::XmlImplementation::HasFeature(const String &strFeature, const String &strVersion)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| strFeature | const String\& | Test edilecek özelliğin paket adı. Bu ad büyük/küçük harfe duyarlı değildir. |
| strVersion | const String\& | Bu, test edilecek paket adının sürüm numarasıdır. Sürüm belirtilmemişse (**nullptr**), özelliğin herhangi bir sürümünü desteklemek yöntemin **true** döndürmesine neden olur. |

### ReturnValue

**true** if the feature is implemented in the specified version; otherwise, **false**.
## Açıklamalar



Aşağıdaki tablo, **HasFeature**'ın **true** döndürmesine neden olan kombinasyonları gösterir. |||
|-|-|
| strFeature | strVersion |
| XML | 1.0 |
| XML | 2.0 |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [XmlImplementation](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
