---
title: "System::Xml::Schema::XmlSchemaValidator sınıfı"
linktitle: "XmlSchemaValidator"
second_title: "Aspose.Page için C++"
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
| [get_ValidationEventSender](./get_validationeventsender/)() | Doğrulama olayının gönderici nesnesi olarak gönderilen nesneyi döndürür. |
| [GetExpectedAttributes](./getexpectedattributes/)() | Geçerli öğe bağlamı için beklenen öznitelikleri döndürür. |
| [GetExpectedParticles](./getexpectedparticles/)() | Geçerli öğe bağlamındaki beklenen parçacıkları döndürür. |
| [GetUnspecifiedDefaultAttributes](./getunspecifieddefaultattributes/)(const SharedPtr\<Collections::Generic::List\<SharedPtr\<Object\>\>\>\&) | Öntanımlı öznitelikler üzerindeki kimlik kısıtlamalarını doğrular ve öğe bağlamında daha önce [XmlSchemaValidator::ValidateAttribute](./validateattribute/) yöntemiyle doğrulanmamış öntanımlı değerlere sahip öznitelikler için [XmlSchemaAttribute](../xmlschemaattribute/) nesneleriyle belirtilen List'i doldurur. |
| [Initialize](./initialize/)() | [XmlSchemaValidator](./) nesnesinin durumunu başlatır. |
| [Initialize](./initialize/)(const SharedPtr\<XmlSchemaObject\>\&) | Kısmi doğrulama için belirtilen [XmlSchemaObject](../xmlschemaobject/) kullanarak [XmlSchemaValidator](./) nesnesinin durumunu başlatır. |
| [set_LineInfoProvider](./set_lineinfoprovider/)(const SharedPtr\<IXmlLineInfo\>\&) | Doğrulanan XML düğümü için satır numarası bilgisini ayarlar. |
| [set_SourceUri](./set_sourceuri/)(const SharedPtr\<Uri\>\&) | Doğrulanan XML düğümü için kaynak URI'sını ayarlar. |
| [set_ValidationEventSender](./set_validationeventsender/)(const SharedPtr\<Object\>\&) | Doğrulama olayının gönderici nesnesi olarak gönderilen nesneyi ayarlar. |
| [set_XmlResolver](./set_xmlresolver/)(const SharedPtr\<System::Xml::XmlResolver\>\&) | [XmlResolver](../../system.xml/xmlresolver/) nesnesini **xs:import** ve **xs:include** öğelerini, ayrıca **xsi:schemaLocation** ve **xsi:noNamespaceSchemaLocation** özniteliklerini çözmek için ayarlar. |
| [SkipToEndElement](./skiptoendelement/)(const SharedPtr\<XmlSchemaInfo\>\&) | Geçerli öğe içeriğinin doğrulamasını atlar ve [XmlSchemaValidator](./) nesnesini üst öğenin bağlamındaki içeriği doğrulamak için hazırlar. |
| [ValidateAttribute](./validateattribute/)(const String\&, const String\&, const String\&, const SharedPtr\<XmlSchemaInfo\>\&) | Geçerli öğe bağlamında öznitelik adını, ad alanı URI'sını ve değerini doğrular. |
| [ValidateAttribute](./validateattribute/)(const String\&, const String\&, XmlValueGetter, const SharedPtr\<XmlSchemaInfo\>\&) | Geçerli öğe bağlamında öznitelik adını, ad alanı URI'sını ve değerini doğrular. |
| [ValidateElement](./validateelement/)(const String\&, const String\&, const SharedPtr\<XmlSchemaInfo\>\&) | Öğeyi geçerli bağlamda doğrular. |
| [ValidateElement](./validateelement/)(const String\&, const String\&, const SharedPtr\<XmlSchemaInfo\>\&, const String\&, const String\&, const String\&, const String\&) | Geçerli bağlamda öğeyi belirtilen **xsi:Type**, **xsi:Nil**, **xsi:SchemaLocation** ve **xsi:NoNamespaceSchemaLocation** öznitelik değerleriyle doğrular. |
| [ValidateEndElement](./validateendelement/)(const SharedPtr\<XmlSchemaInfo\>\&) | Basit içerikli öğeler için öğenin metin içeriğinin veri türüne göre geçerli olup olmadığını ve karmaşık içerikli öğeler için geçerli öğenin içeriğinin tam olup olmadığını doğrular. |
| [ValidateEndElement](./validateendelement/)(const SharedPtr\<XmlSchemaInfo\>\&, const SharedPtr\<Object\>\&) | Belirtilen öğenin metin içeriğinin veri türüne göre geçerli olup olmadığını doğrular. |
| [ValidateEndOfAttributes](./validateendofattributes/)(const SharedPtr\<XmlSchemaInfo\>\&) | Öğe bağlamındaki tüm gerekli özniteliklerin mevcut olup olmadığını doğrular ve [XmlSchemaValidator](./) nesnesini öğenin alt içeriğini doğrulamak için hazırlar. |
| [ValidateText](./validatetext/)(const String\&) | Belirtilen metin **string**'in geçerli öğe bağlamında izinli olup olmadığını doğrular ve öğe basit içerikli ise doğrulama için metni biriktirir. |
| [ValidateText](./validatetext/)(XmlValueGetter) | Belirtilen [XmlValueGetter](../xmlvaluegetter/) nesnesi tarafından döndürülen metnin geçerli öğe bağlamında izinli olup olmadığını doğrular ve öğe basit içerikli ise doğrulama için metni biriktirir. |
| [ValidateWhitespace](./validatewhitespace/)(const String\&) | Belirtilen **string** içindeki boşluk karakterlerinin geçerli öğe bağlamında izinli olup olmadığını doğrular ve öğe basit içerikli ise doğrulama için boşluk karakterlerini biriktirir. |
| [ValidateWhitespace](./validatewhitespace/)(XmlValueGetter) | Belirtilen [XmlValueGetter](../xmlvaluegetter/) nesnesi tarafından döndürülen boşluk karakterlerinin geçerli öğe bağlamında izinli olup olmadığını doğrular ve öğe basit içerikli ise doğrulama için boşluk karakterlerini biriktirir. |
| [XmlSchemaValidator](./xmlschemavalidator/)(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlSchemaSet\>\&, const SharedPtr\<IXmlNamespaceResolver\>\&, XmlSchemaValidationFlags) | [XmlSchemaValidator](./) sınıfının yeni bir örneğini başlatır. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [Ptr](./ptr/) | Bu sınıfın bir örneğine ortak gösterici için bir takma addır. |
## Açıklamalar



Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Yığını üzerinde veya new operatörüyle bu tipin örneklerini asla oluşturmayın, çünkü bu çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
