---
title: "System::Xml::Schema::XmlSchemaInclude sınıfı"
linktitle: "XmlSchemaInclude"
second_title: "Aspose.Font için C++"
description: "System::Xml::Schema::XmlSchemaInclude sınıfı. XML Şema'dan World Wide Web Consortium (W3C) tarafından tanımlanan include öğesini temsil eder. Bu sınıf, dış bir şemadan bildirim ve tanımlamaları dahil etmek için kullanılır. Dahil edilen bildirim ve tanımlamalar, C++'daki içeren şemada işlenmek üzere kullanılabilir."
type: docs
weight: 3600
url: /tr/cpp/system.xml.schema/xmlschemainclude/
---
## XmlSchemaInclude class


XML [Schema](../) tarafından World Wide [Web](../../system.web/) Consortium (W3C) tarafından tanımlanan **include** öğesini temsil eder. Bu sınıf, dış bir şemadan bildirim ve tanımlamaları dahil etmek için kullanılır. Dahil edilen bildirim ve tanımlamalar, içeren şemada işlenmek üzere kullanılabilir.

```cpp
class XmlSchemaInclude : public System::Xml::Schema::XmlSchemaExternal
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_Annotation](./get_annotation/)() | **annotation** değerini döndürür. |
| [set_Annotation](./set_annotation/)(const SharedPtr\<XmlSchemaAnnotation\>\&) | **annotation** değerini ayarlar. |
| [XmlSchemaInclude](./xmlschemainclude/)() | Yeni bir [XmlSchemaInclude](./) sınıfı örneği başlatır. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [Ptr](./ptr/) | Bu sınıfın bir örneğine ortak gösterici için bir takma ad. |
## Açıklamalar



Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu türden örnekleri yığıt üzerinde veya new operatörüyle oluşturmayın, çünkü bu çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) göstericisine sarın ve bu göstericiyi fonksiyonlara argüman olarak geçirmek için kullanın.

## Ayrıca Bakınız

* Class [XmlSchemaExternal](../xmlschemaexternal/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
