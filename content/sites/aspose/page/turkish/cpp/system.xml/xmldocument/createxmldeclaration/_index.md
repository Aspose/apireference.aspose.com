---
title: "System::Xml::XmlDocument::CreateXmlDeclaration yöntemi"
linktitle: "CreateXmlDeclaration"
second_title: "Aspose.Page için C++"
description: "System::Xml::XmlDocument::CreateXmlDeclaration yöntemi. Belirtilen değerlerle bir XmlDeclaration düğümü oluşturur C++'da."
type: docs
weight: 1600
url: /tr/cpp/system.xml/xmldocument/createxmldeclaration/
---
## XmlDocument::CreateXmlDeclaration method


Belirtilen değerlerle bir [XmlDeclaration](../../xmldeclaration/) düğümü oluşturur.

```cpp
virtual SharedPtr<XmlDeclaration> System::Xml::XmlDocument::CreateXmlDeclaration(const String &version, const String &encoding, const String &standalone)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| sürüm | const String\& | Sürüm "1.0" olmalıdır. |
| encoding | const String\& | Encoding özniteliğinin değeri. Bu, [XmlDocument](../) bir dosyaya veya akışa kaydettiğinizde kullanılan kodlamadır; bu nedenle, [Text::Encoding](../../../system.text/encoding/) sınıfı tarafından desteklenen bir dizeye ayarlanmalıdır, aksi takdirde "XmlDocument::Save(String)" başarısız olur. Bu **nullptr** veya [String::Empty](../../../system/string/empty/) ise, [XmlDocument::Save](../save/) yöntemi XML bildiriminde bir encoding özniteliği yazmaz ve bu yüzden varsayılan kodlama, UTF-8, kullanılır. |
| standalone | const String\& | Değer "yes" ya da "no" olmalıdır. Bu **nullptr** veya [String::Empty](../../../system/string/empty/) ise, [XmlDocument::Save](../save/) yöntemi XML bildiriminde bir standalone özniteliği yazmaz. |

### ReturnValue

Yeni [XmlDeclaration](../../xmldeclaration/) düğümü.
## Açıklamalar



Not: Eğer [XmlDocument](../) bir TextWriter ya da bir [XmlTextWriter](../../xmltextwriter/)a kaydedilirse, bu kodlama değeri göz ardı edilir. Bunun yerine, TextWriter'ın veya [XmlTextWriter](../../xmltextwriter/)ın kodlaması kullanılır. Bu, dışa yazılan XML'in doğru kodlamayla tekrar okunabilmesini sağlar.
## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlDeclaration](../../xmldeclaration/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
