---
title: "System::Xml::XmlNode::Supports yöntemi"
linktitle: "Supports"
second_title: "Aspose.Font için C++"
description: "System::Xml::XmlNode::Supports yöntemi. DOM uygulamasının C++'ta belirli bir özelliği uygulayıp uygulamadığını test eder."
type: docs
weight: 4400
url: /tr/cpp/system.xml/xmlnode/supports/
---
## XmlNode::Supports method


DOM uygulamasının belirli bir özelliği uygulayıp uygulamadığını test eder.

```cpp
virtual bool System::Xml::XmlNode::Supports(String feature, String version)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| özellik | Dize | Test edilecek özelliğin paket adı. Bu ad büyük/küçük harfe duyarlı değildir. |
| sürüm | Dize | Test edilecek paket adının sürüm numarası. Sürüm belirtilmemişse (null), özelliğin herhangi bir sürümünü desteklemek yöntemin true döndürmesine neden olur. |

### ReturnValue

**true** if the feature is implemented in the specified version; otherwise, **false**.
## Açıklamalar



Aşağıdaki tablo, **true** döndüren kombinasyonları açıklar. |||
|-|-|
| Özellik | Sürüm |
| XML | 1.0 |
| XML | 2.0 |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
