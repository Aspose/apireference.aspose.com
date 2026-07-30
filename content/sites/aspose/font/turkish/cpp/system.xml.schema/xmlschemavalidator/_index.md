---
title: "System::Xml::Schema::XmlSchemaValidator sınıfı"
linktitle: "XmlSchemaValidator"
second_title: "Aspose.Font için C++"
description: "System::Xml::Schema::XmlSchemaValidator sınıfı. Bir XML Şema Tanım Dili (XSD) şema doğrulama motorunu temsil eder. XmlSchemaValidator sınıfı C++'ta kalıtılamaz."
type: docs
weight: 7000
url: /tr/cpp/system.xml.schema/xmlschemavalidator/
---
## XmlSchemaValidator class


XML [Schema](../) Tanım Dili (XSD) [Schema](../) doğrulama motorunu temsil eder. [XmlSchemaValidator](./) sınıfı kalıtılamaz.

```cpp
class XmlSchemaValidator : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [AddSchema](./addschema/)(const SharedPtr\<XmlSchema\>\&) | Doğrulama için kullanılan şema kümesine bir XML [Schema](../) Tanım Dili (XSD) şeması ekler. |
| [EndValidation](./endvalidation/)() | Doğrulamayı sonlandırır ve tüm XML belgesi için kimlik kısıtlamalarını kontrol eder. |
| [get_LineInfoProvider](./get_lineinfoprovider/)() | Doğrulanan XML düğümünün satır numarası bilgisini döndürür. |
| [get_SourceUri](./get_sourceuri/)() | Doğrulanan XML düğümünün kaynak URI'sını döndürür. |
| [get_ValidationEventSender](./get_validationeventsender/)() | Bir doğrulama olayının gönderici nesnesi olarak gönderilen nesneyi döndürür. |
| [GetExpectedAttributes](./getexpectedattributes/)() | Geçerli öğe bağlamı için beklenen öznitelikleri döndürür. |
| [GetExpectedParticles](./getexpectedparticles/)() | Geçerli öğe bağlamındaki beklenen parçacıkları döndürür. |
| [GetUnspecifiedDefaultAttributes](./getunspecifieddefaultattributes/)(const SharedPtr\<Collections::Generic::List\<SharedPtr\<Object\>\>\>\&) | Öntanımlı öznitelikler üzerindeki kimlik kısıtlamalarını doğrular ve öğe bağlamında daha önce [XmlSchemaValidator::ValidateAttribute](./validateattribute/) yöntemiyle doğrulanmamış öntanımlı değerlere sahip öznitelikler için belirtilen Listeyi [XmlSchemaAttribute](../xmlschemaattribute/) nesneleriyle doldurur. |
| [Initialize](./initialize/)() | [XmlSchemaValidator](./) nesnesinin durumunu başlatır. |
| [Initialize](./initialize/)(const SharedPtr\<XmlSchemaObject\>\&) | Kısmi doğrulama için belirtilen [XmlSchemaObject](../xmlschemaobject/) kullanarak [XmlSchemaValidator](./) nesnesinin durumunu başlatır. |
| [set_LineInfoProvider](./set_lineinfoprovider/)(const SharedPtr\<IXmlLineInfo\>\&) | Doğrulanan XML düğümünün satır numarası bilgisini ayarlar. |
| [set_SourceUri](./set_sourceuri/)(const SharedPtr\<Uri\>\&) | Doğrulanan XML düğümünün kaynak URI'sını ayarlar. |
| [set_ValidationEventSender](./set_validationeventsender/)(const SharedPtr\<Object\>\&) | Bir doğrulama olayının gönderici nesnesi olarak gönderilen nesneyi ayarlar. |
| [set_XmlResolver](./set_xmlresolver/)(const SharedPtr\<System::Xml::XmlResolver\>\&) | [XmlResolver](../../system.xml/xmlresolver/) nesnesini, **xs:import** ve **xs:include** öğelerini ve ayrıca **xsi:schemaLocation** ve **xsi:noNamespaceSchemaLocation** özniteliklerini çözmek için ayarlar. |
| [SkipToEndElement](./skiptoendelement/)(const SharedPtr\<XmlSchemaInfo\>\&) | Geçerli öğenin içeriğinin doğrulamasını atlar ve [XmlSchemaValidator](./) nesnesini, üst öğenin bağlamında içeriği doğrulamak için hazırlar. |
| [ValidateAttribute](./validateattribute/)(const String\&, const String\&, const String\&, const SharedPtr\<XmlSchemaInfo\>\&) | Geçerli öğe bağlamında öznitelik adını, ad alanı URI'sini ve değerini doğrular. |
| [ValidateAttribute](./validateattribute/)(const String\&, const String\&, XmlValueGetter, const SharedPtr\<XmlSchemaInfo\>\&) | Geçerli öğe bağlamında öznitelik adını, ad alanı URI'sini ve değerini doğrular. |
| [ValidateElement](./validateelement/)(const String\&, const String\&, const SharedPtr\<XmlSchemaInfo\>\&) | Geçerli bağlamda öğeyi doğrular. |
| [ValidateElement](./validateelement/)(const String\&, const String\&, const SharedPtr\<XmlSchemaInfo\>\&, const String\&, const String\&, const String\&, const String\&) | Belirtilen **xsi:Type**, **xsi:Nil**, **xsi:SchemaLocation** ve **xsi:NoNamespaceSchemaLocation** öznitelik değerleriyle geçerli bağlamda öğeyi doğrular. |
| [ValidateEndElement](./validateendelement/)(const SharedPtr\<XmlSchemaInfo\>\&) | Basit içerikli öğeler için öğenin metin içeriğinin veri türüne göre geçerli olup olmadığını ve karmaşık içerikli öğeler için geçerli öğenin içeriğinin tamam olup olmadığını doğrular. |
| [ValidateEndElement](./validateendelement/)(const SharedPtr\<XmlSchemaInfo\>\&, const SharedPtr\<Object\>\&) | Belirtilen öğenin metin içeriğinin veri türüne göre geçerli olup olmadığını doğrular. |
| [ValidateEndOfAttributes](./validateendofattributes/)(const SharedPtr\<XmlSchemaInfo\>\&) | Öğe bağlamındaki tüm gerekli özniteliklerin mevcut olup olmadığını doğrular ve [XmlSchemaValidator](./) nesnesini, öğenin alt içeriğini doğrulamak için hazırlar. |
| [ValidateText](./validatetext/)(const String\&) | Belirtilen metin **string**'in geçerli öğe bağlamında izin verilip verilmediğini doğrular ve öğe basit içerikli ise doğrulama için metni biriktirir. |
| [ValidateText](./validatetext/)(XmlValueGetter) | Belirtilen [XmlValueGetter](../xmlvaluegetter/) nesnesi tarafından döndürülen metnin geçerli öğe bağlamında izin verilip verilmediğini doğrular ve öğe basit içerikli ise doğrulama için metni biriktirir. |
| [ValidateWhitespace](./validatewhitespace/)(const String\&) | Belirtilen **string** içindeki boşlukların geçerli öğe bağlamında izin verilip verilmediğini doğrular ve öğe basit içerikli ise doğrulama için boşlukları biriktirir. |
| [ValidateWhitespace](./validatewhitespace/)(XmlValueGetter) | Belirtilen [XmlValueGetter](../xmlvaluegetter/) nesnesi tarafından döndürülen boşlukların geçerli öğe bağlamında izin verilip verilmediğini doğrular ve öğe basit içerikli ise doğrulama için boşlukları biriktirir. |
| [XmlSchemaValidator](./xmlschemavalidator/)(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlSchemaSet\>\&, const SharedPtr\<IXmlNamespaceResolver\>\&, XmlSchemaValidationFlags) | [XmlSchemaValidator](./) sınıfının yeni bir örneğini başlatır. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [Ptr](./ptr/) | Bu sınıfın bir örneğine ortak gösterici için bir takma ad. |
## Açıklamalar



Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu türden örnekleri yığıt üzerinde veya new operatörüyle oluşturmayın, çünkü bu çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) göstericisine sarın ve bu göstericiyi fonksiyonlara argüman olarak geçirmek için kullanın.

## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
