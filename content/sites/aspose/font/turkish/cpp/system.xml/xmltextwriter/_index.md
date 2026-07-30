---
title: "System::Xml::XmlTextWriter class"
linktitle: "XmlTextWriter"
second_title: "Aspose.Font için C++"
description: "System::Xml::XmlTextWriter sınıfı. W3C Genişletilebilir İşaretleme Dili (XML) 1.0 ve XML'deki Ad alanları önerilerine uygun XML verisi içeren akışlar veya dosyalar oluşturmak için hızlı, önbelleğe alınmamış, yalnızca ileriye doğru bir yazar temsil eder."
type: docs
weight: 4000
url: /tr/cpp/system.xml/xmltextwriter/
---
## XmlTextWriter class


W3C Extensible Markup Language (XML) 1.0 ve XML'deki Ad Alanları önerilerine uygun XML verileri içeren akışlar veya dosyalar oluşturan hızlı, önbelleğe alınmamış, yalnızca ileri bir yöntem sağlayan bir yazıcıyı temsil eder.

```cpp
class XmlTextWriter : public System::Xml::XmlWriter
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Close](./close/)() override | Bu akışı ve temel akışı kapatır. |
| [Flush](./flush/)() override | Arabellekteki tüm veriyi temel akışlara yazar ve ayrıca temel akışı da temizler. |
| [get_BaseStream](./get_basestream/)() | Temel akış nesnesini döndürür. |
| [get_Formatting](./get_formatting/)() | Çıktının nasıl biçimlendirildiğini gösterir. |
| [get_Indentation](./get_indentation/)() | Hiyerarşideki her seviye için kaç IndentChars yazılacağını, [XmlTextWriter::set_Formatting](./set_formatting/) [Formatting::Indented](../formatting/) olarak ayarlandığında döndürür. |
| [get_IndentChar](./get_indentchar/)() | İndentleme için hangi karakterin kullanılacağını, [XmlTextWriter::set_Formatting](./set_formatting/) [Formatting::Indented](../formatting/) olarak ayarlandığında döndürür. |
| [get_Namespaces](./get_namespaces/)() | Namespace desteğinin yapılacağını gösteren bir değer döndürür. |
| [get_QuoteChar](./get_quotechar/)() | Özellik değerlerini tırnaklamak için hangi karakterin kullanılacağını döndürür. |
| [get_WriteState](./get_writestate/)() override | Yazıcının durumunu döndürür. |
| [get_XmlLang](./get_xmllang/)() override | Mevcut **xml:lang** kapsamını döndürür. |
| [get_XmlSpace](./get_xmlspace/)() override | Mevcut **xml:space** kapsamını temsil eden bir [XmlSpace](../xmlspace/) döndürür. |
| [LookupPrefix](./lookupprefix/)(String) override | Namespace URI'si için mevcut namespace kapsamında tanımlı en yakın önek'i döndürür. |
| [set_Formatting](./set_formatting/)(System::Xml::Formatting) | Çıktının nasıl biçimlendirildiğini gösterir. |
| [set_Indentation](./set_indentation/)(int32_t) | Hiyerarşideki her seviye için kaç IndentChars yazılacağını, [XmlTextWriter::set_Formatting](./set_formatting/) [Formatting::Indented](../formatting/) olarak ayarlandığında ayarlar. |
| [set_IndentChar](./set_indentchar/)(char16_t) | İndentleme için hangi karakterin kullanılacağını, [XmlTextWriter::set_Formatting](./set_formatting/) [Formatting::Indented](../formatting/) olarak ayarlandığında ayarlar. |
| [set_Namespaces](./set_namespaces/)(bool) | Namespace desteğinin yapılacağını gösteren bir değeri ayarlar. |
| [set_QuoteChar](./set_quotechar/)(char16_t) | Özellik değerlerini tırnaklamak için hangi karakterin kullanılacağını ayarlar. |
| [WriteBase64](./writebase64/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | Belirtilen ikili baytları base64 olarak kodlar ve ortaya çıkan metni yazar. |
| [WriteBinHex](./writebinhex/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | Belirtilen ikili baytları binhex olarak kodlar ve ortaya çıkan metni yazar. |
| [WriteCData](./writecdata/)(String) override | Belirtilen metni içeren bir **...** bloğu yazar. |
| [WriteCharEntity](./writecharentity/)(char16_t) override | Belirtilen Unicode karakter değeri için bir karakter varlığı oluşturulmasını zorlar. |
| [WriteChars](./writechars/)(ArrayPtr\<char16_t\>, int32_t, int32_t) override | Metni bir seferde bir tampon olarak yazar. |
| [WriteComment](./writecomment/)(String) override | Belirtilen metni içeren bir **** yorum yazar. |
| [WriteDocType](./writedoctype/)(const String\&, const String\&, const String\&, const String\&) override | Belirtilen ad ve isteğe bağlı özniteliklerle DOCTYPE bildirimini yazar. |
| [WriteEndAttribute](./writeendattribute/)() override | Önceki [XmlTextWriter::WriteStartAttribute](./writestartattribute/) çağrısını kapatır. |
| [WriteEndDocument](./writeenddocument/)() override | Açık olan tüm öğeleri veya öznitelikleri kapatır ve yazıcıyı Başlangıç durumuna geri koyar. |
| [WriteEndElement](./writeendelement/)() override | Bir öğeyi kapatır ve ilgili namespace kapsamını çıkarır. |
| [WriteEntityRef](./writeentityref/)(const String\&) override | Bir varlık referansını **&name**; olarak yazar. |
| [WriteFullEndElement](./writefullendelement/)() override | Bir öğeyi kapatır ve ilgili namespace kapsamını çıkarır. |
| [WriteName](./writename/)(const String\&) override | Belirtilen adı yazar, [W3C XML 1.0 recommendation](https://www.w3.org/TR/1998/REC-xml-19980210#NT-Name) göre geçerli bir ad olduğundan emin olur. |
| [WriteNmToken](./writenmtoken/)(const String\&) override | Belirtilen adı yazar, bunun **NmToken**'in [W3C XML 1.0 önerisi](https://www.w3.org/TR/1998/REC-xml-19980210#NT-Name) göre geçerli olduğundan emin olur. |
| [WriteProcessingInstruction](./writeprocessinginstruction/)(String, String) override | İsim ve metin arasında bir boşluk bırakarak işleme talimatını şu şekilde yazar: **<?name text?>**. |
| [WriteQualifiedName](./writequalifiedname/)(const String\&, const String\&) override | Ad alanı nitelikli adı yazar. Bu yöntem, verilen ad alanı için kapsamda olan öneki bulur. |
| [WriteRaw](./writeraw/)(ArrayPtr\<char16_t\>, int32_t, int32_t) override | Bir karakter tamponundan ham işaretlemeyi manuel olarak yazar. |
| [WriteRaw](./writeraw/)(const String\&) override | Bir dizeden ham işaretlemeyi manuel olarak yazar. |
| [WriteStartAttribute](./writestartattribute/)(const String\&, const String\&, const String\&) override | Bir öznitelik başlangıcını yazar. |
| [WriteStartDocument](./writestartdocument/)() override | "1.0" sürümüyle XML bildirimini yazar. |
| [WriteStartDocument](./writestartdocument/)(bool) override | "1.0" sürümü ve standalone özniteliğiyle XML bildirimini yazar. |
| [WriteStartElement](./writestartelement/)(const String\&, const String\&, const String\&) override | Belirtilen başlangıç etiketini yazar ve verilen ad alanı ve önek ile ilişkilendirir. |
| [WriteString](./writestring/)(const String\&) override | Verilen metin içeriğini yazar. |
| [WriteSurrogateCharEntity](./writesurrogatecharentity/)(char16_t, char16_t) override | Surrogaat karakter çifti için surrogaat karakter varlığını oluşturur ve yazar. |
| [WriteWhitespace](./writewhitespace/)(String) override | Verilen boşluk karakterlerini yazar. |
| [XmlTextWriter](./xmltextwriter/)(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<Text::Encoding\>\&) | Belirtilen akış ve kodlamayı kullanarak [XmlTextWriter](./) sınıfının bir örneğini oluşturur. |
| [XmlTextWriter](./xmltextwriter/)(const String\&, const SharedPtr\<Text::Encoding\>\&) | Belirtilen dosyayı kullanarak [XmlTextWriter](./) sınıfının bir örneğini oluşturur. |
| [XmlTextWriter](./xmltextwriter/)(const SharedPtr\<IO::TextWriter\>\&) | Belirtilen TextWriter'ı kullanarak [XmlTextWriter](./) sınıfının bir örneğini oluşturur. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [Ptr](./ptr/) | Bu sınıfın bir örneğine ortak gösterici için bir takma ad. |
## Açıklamalar



Bunun yerine [XmlWriter](../xmlwriter/) sınıfını kullanmanız önerilir.

Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu türden örnekleri yığıt üzerinde veya new operatörüyle oluşturmayın, çünkü bu çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) göstericisine sarın ve bu göstericiyi fonksiyonlara argüman olarak geçirmek için kullanın.

## Ayrıca Bakınız

* Class [XmlWriter](../xmlwriter/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
