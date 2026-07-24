---
title: "System::Xml::XmlReader::get_SchemaInfo metode"
linktitle: "get_SchemaInfo"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::XmlReader::get_SchemaInfo metode. Mengembalikan informasi skema yang telah ditetapkan ke node saat ini sebagai hasil validasi skema dalam C++."
type: docs
weight: 2200
url: /id/cpp/system.xml/xmlreader/get_schemainfo/
---
## XmlReader::get_SchemaInfo method


Mengembalikan informasi skema yang telah diberikan ke node saat ini sebagai hasil dari validasi skema.

```cpp
virtual SharedPtr<Schema::IXmlSchemaInfo> System::Xml::XmlReader::get_SchemaInfo()
```


### ReturnValue

Objek IXmlSchemaInfo yang berisi informasi skema untuk node saat ini. Informasi [Schema](../../../system.xml.schema/) dapat diatur pada elemen, atribut, atau pada node teks dengan nilai [XmlReader::get_ValueType](../get_valuetype/) yang tidak null. Jika node saat ini bukan salah satu tipe node di atas, atau jika instance [XmlReader](../) tidak melaporkan informasi skema, metode ini mengembalikan **nullptr**. Jika metode ini dipanggil dari objek [XmlTextReader](../../xmltextreader/) atau [XmlValidatingReader](../../xmlvalidatingreader/), metode ini selalu mengembalikan **nullptr**. Implementasi [XmlReader](../) ini tidak mengekspos informasi skema melalui metode get_SchemaInfo.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXmlSchemaInfo](../../../system.xml.schema/ixmlschemainfo/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
