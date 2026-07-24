---
title: "System::Xml::XmlWriter::WriteDocType yöntemi"
linktitle: "WriteDocType"
second_title: "Aspose.Page için C++"
description: "System::Xml::XmlWriter::WriteDocType yöntemi. Türetilmiş bir sınıfta geçersiz kılındığında, belirtilen ad ve isteğe bağlı özniteliklerle DOCTYPE bildirimini C++'ta yazar."
type: docs
weight: 1700
url: /tr/cpp/system.xml/xmlwriter/writedoctype/
---
## XmlWriter::WriteDocType method


Türetilmiş bir sınıfta geçersiz kılındığında, belirtilen ad ve isteğe bağlı özniteliklerle DOCTYPE bildirimini yazar.

```cpp
virtual void System::Xml::XmlWriter::WriteDocType(const String &name, const String &pubid, const String &sysid, const String &subset)=0
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| ad | const String\& | DOCTYPE'ın adı. Bu boş olmamalıdır. |
| pubid | const String\& | Eğer null değilse, PUBLIC "pubid" "sysid" yazar; burada **pubid** ve **sysid**, verilen argümanların değeriyle değiştirilir. |
| sysid | const String\& | Eğer **pubid** **nullptr** ise ve **sysid** null değilse, **sysid** bu argümanın değeriyle değiştirilerek SYSTEM "sysid" yazar. |
| subset | const String\& | Eğer null değilse, [subset] yazar; burada subset, bu argümanın değeriyle değiştirilir. |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
