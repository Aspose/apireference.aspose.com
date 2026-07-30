---
title: "System::Xml::Schema::ValidationEventArgs class"
linktitle: "ValidationEventArgs"
second_title: "Aspose.Font için C++"
description: "System::Xml::Schema::ValidationEventArgs sınıfı. C++'da ValidationEventHandler ile ilgili ayrıntılı bilgileri döndürür."
type: docs
weight: 200
url: /tr/cpp/system.xml.schema/validationeventargs/
---
## ValidationEventArgs class


[ValidationEventHandler](../validationeventhandler/) ile ilgili ayrıntılı bilgileri döndürür.

```cpp
class ValidationEventArgs : public System::EventArgs
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_Exception](./get_exception/)() | Doğrulama olayıyla ilişkili [XmlSchemaException](../xmlschemaexception/) nesnesini döndürür. |
| [get_Message](./get_message/)() | Doğrulama olayına karşılık gelen metin açıklamasını döndürür. |
| [get_Severity](./get_severity/)() | Doğrulama olayının şiddetini döndürür. |
## Alanlar

| Alan | Açıklama |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | Boş bir [EventArgs](../../system/eventargs/) paylaşımlı işaretçiyi (null-pointer) temsil eden statik bir üye. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [Ptr](./ptr/) | Bu sınıfın bir örneğine ortak gösterici için bir takma ad. |
## Açıklamalar



Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu türden örnekleri yığıt üzerinde veya new operatörüyle oluşturmayın, çünkü bu çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) göstericisine sarın ve bu göstericiyi fonksiyonlara argüman olarak geçirmek için kullanın.

## Ayrıca Bakınız

* Class [EventArgs](../../system/eventargs/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
