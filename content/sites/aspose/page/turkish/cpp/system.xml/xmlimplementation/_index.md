---
title: "System::Xml::XmlImplementation sınıfı"
linktitle: "XmlImplementation"
second_title: "Aspose.Page için C++"
description: "System::Xml::XmlImplementation sınıfı. C++'da bir dizi XmlDocument nesnesi için bağlamı tanımlar."
type: docs
weight: 2000
url: /tr/cpp/system.xml/xmlimplementation/
---
## XmlImplementation class


[XmlDocument](../xmldocument/) nesnelerinin bir kümesi için bağlamı tanımlar.

```cpp
class XmlImplementation : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| virtual [CreateDocument](./createdocument/)() | Yeni bir [XmlDocument](../xmldocument/) oluşturur. |
| [HasFeature](./hasfeature/)(const String\&, const String\&) | Belge [Object](../../system/object/) Modeli (DOM) uygulamasının belirli bir özelliği uygulayıp uygulamadığını test eder. |
| [XmlImplementation](./xmlimplementation/)() | Yeni bir [XmlImplementation](./) sınıf örneği başlatır. |
| [XmlImplementation](./xmlimplementation/)(const SharedPtr\<XmlNameTable\>\&) | Belirtilen [XmlNameTable](../xmlnametable/) ile yeni bir [XmlImplementation](./) sınıf örneği başlatır. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [Ptr](./ptr/) | Bu sınıfın bir örneğine ortak gösterici için bir takma addır. |
## Açıklamalar



Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Yığını üzerinde veya new operatörüyle bu tipin örneklerini asla oluşturmayın, çünkü bu çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
