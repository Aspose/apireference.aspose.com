---
title: "System::Xml::Schema::XmlAtomicValue sınıfı"
linktitle: "XmlAtomicValue"
second_title: "Aspose.Font için C++"
description: "System::Xml::Schema::XmlAtomicValue sınıfı. Doğrulanmış bir XML öğesi veya özniteliğinin tiplenmiş değerini temsil eder. XmlAtomicValue sınıfı C++'da kalıtılamaz."
type: docs
weight: 300
url: /tr/cpp/system.xml.schema/xmlatomicvalue/
---
## XmlAtomicValue class


Doğrulanmış bir XML öğesi veya özniteliğinin tiplenmiş değerini temsil eder. [XmlAtomicValue](./) sınıfı kalıtılamaz.

```cpp
class XmlAtomicValue : public System::Xml::XPath::XPathItem
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Clone](./clone/)() | Bu [XmlAtomicValue](./) nesnesinin bir kopyasını döndürür. |
| [get_IsNode](./get_isnode/)() override | Doğrulanan XML öğesinin veya özniteliğinin bir [XPath](../../system.xml.xpath/) düğümü mü yoksa atomik bir değer mi olduğunu gösteren bir değer döndürür. |
| [get_TypedValue](./get_typedvalue/)() override | Şema türüne göre en uygun tipte bir kutulanmış nesne olarak geçerli doğrulanan XML öğesini veya özniteliğini döndürür. |
| [get_Value](./get_value/)() override | Doğrulanan XML öğesinin veya özniteliğinin [String](../../system/string/) değerini döndürür. |
| [get_ValueAsBoolean](./get_valueasboolean/)() override | Doğrulanan XML öğesinin veya özniteliğinin değerini bir [Boolean](../../system/boolean/) olarak döndürür. |
| [get_ValueAsDateTime](./get_valueasdatetime/)() override | Doğrulanan XML öğesinin veya özniteliğinin değerini bir [DateTime](../../system/datetime/) olarak döndürür. |
| [get_ValueAsDouble](./get_valueasdouble/)() override | Doğrulanan XML öğesinin veya özniteliğinin değerini bir [Double](../../system/double/) olarak döndürür. |
| [get_ValueAsInt](./get_valueasint/)() override | Doğrulanan XML öğesinin veya özniteliğinin değerini bir [Int32](../../system/int32/) olarak döndürür. |
| [get_ValueAsLong](./get_valueaslong/)() override | Doğrulanan XML öğesinin veya özniteliğinin değerini bir [Int64](../../system/int64/) olarak döndürür. |
| [get_ValueType](./get_valuetype/)() override | Doğrulanan XML öğesinin veya özniteliğinin tipini döndürür. |
| [get_XmlType](./get_xmltype/)() override | Doğrulanan XML öğesi veya özniteliği için [XmlSchemaType](../xmlschematype/) döndürür. |
| [ToString](./tostring/)() const override | Doğrulanan XML öğesinin veya özniteliğinin [String](../../system/string/) değerini döndürür. |
| [ValueAs](./valueas/)(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) override | Doğrulanan XML öğesinin veya özniteliğinin değerini, ad alanı öneklerini çözmek için belirtilen [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) nesnesi kullanılarak belirtilen tipe göre döndürür. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [Ptr](./ptr/) | Bu sınıfın bir örneğine ortak gösterici için bir takma ad. |
## Açıklamalar



Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu türden örnekleri yığıt üzerinde veya new operatörüyle oluşturmayın, çünkü bu çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) göstericisine sarın ve bu göstericiyi fonksiyonlara argüman olarak geçirmek için kullanın.

## Ayrıca Bakınız

* Class [XPathItem](../../system.xml.xpath/xpathitem/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
