---
title: "System::Xml::Serialization::IXmlSerializable class"
linktitle: "IXmlSerializable"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::Serialization::IXmlSerializable class. Menyediakan format khusus untuk serialisasi dan deserialisasi XML. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer tersebut untuk melewatkannya ke fungsi sebagai argumen di C++."
type: docs
weight: 100
url: /id/cpp/system.xml.serialization/ixmlserializable/
---
## IXmlSerializable class


Menyediakan format khusus untuk serialisasi dan deserialisasi XML. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer tersebut untuk melewatkannya ke fungsi sebagai argumen.

```cpp
class IXmlSerializable : public virtual System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| virtual [GetSchema](./getschema/)() | Objek XmlSchema yang menggambarkan representasi XML dari objek yang dikembalikan oleh metode [WriteXml()](./writexml/) dan diterima oleh metode [ReadXml()](./readxml/). |
| virtual [ReadXml](./readxml/)(System::SharedPtr\<System::Xml::XmlReader\>) | Mendeserialisasi objek dari representasi XML-nya. |
| virtual [WriteXml](./writexml/)(System::SharedPtr\<System::Xml::XmlWriter\>) | Menserealisis objek saat ini ke representasi XML. |
| virtual [~IXmlSerializable](./~ixmlserializable/)() | Destruktor. |
## Lihat Juga

* Class [Object](../../system/object/)
* Namespace [System::Xml::Serialization](../)
* Library [Aspose.Page for C++](../../)
