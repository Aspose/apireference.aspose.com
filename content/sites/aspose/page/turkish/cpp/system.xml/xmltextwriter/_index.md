---
title: "System::Xml::XmlTextWriter sınıfı"
linktitle: "XmlTextWriter"
second_title: "Aspose.Page için C++"
description: "System::Xml::XmlTextWriter sınıfı. C++'ta W3C Genişletilebilir İşaretleme Dili (XML) 1.0 ve XML'deki Ad alanları önerilerine uygun XML verisi içeren akışlar veya dosyalar oluşturmak için hızlı, önbelleğe alınmamış, yalnızca ileriye doğru bir yazar sağlar."
type: docs
weight: 4000
url: /tr/cpp/system.xml/xmltextwriter/
---
## XmlTextWriter class


W3C Extensible Markup Language (XML) 1.0 ve XML'deki Ad alanları önerilerine uygun XML verileri içeren akışlar veya dosyalar oluşturmak için hızlı, önbelleğe alınmamış, yalnızca ileriye doğru bir yol sağlayan bir yazarı temsil eder.

```cpp
class XmlTextWriter : public System::Xml::XmlWriter
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Close](./close/)() override | Bu akışı ve temel akışı kapatır. |
| [Flush](./flush/)() override | Arabellekteki her şeyi temel akışlara yazar ve ayrıca temel akışı da temizler. |
| [get_BaseStream](./get_basestream/)() | Temel akış nesnesini döndürür. |
| [get_Formatting](./get_formatting/)() | Çıktının nasıl biçimlendirildiğini gösterir. |
| [get_Indentation](./get_indentation/)() | [XmlTextWriter::set_Formatting](./set_formatting/) [Formatting::Indented](../formatting/) olarak ayarlandığında hiyerarşideki her seviye için kaç IndentChars yazılacağını döndürür. |
| [get_IndentChar](./get_indentchar/)() | [XmlTextWriter::set_Formatting](./set_formatting/) [Formatting::Indented](../formatting/) olarak ayarlandığında girinti için hangi karakterin kullanılacağını döndürür. |
| [get_Namespaces](./get_namespaces/)() | Ad alanı desteğinin yapılması gerekip gerekmediğini gösteren bir değer döndürür. |
| [get_QuoteChar](./get_quotechar/)() | Özellik değerlerini tırnak içine almak için hangi karakterin kullanılacağını döndürür. |
| [get_WriteState](./get_writestate/)() override | Yazarın durumunu döndürür. |
| [get_XmlLang](./get_xmllang/)() override | Mevcut **xml:lang** kapsamını döndürür. |
| [get_XmlSpace](./get_xmlspace/)() override | Mevcut **xml:space** kapsamını temsil eden bir [XmlSpace](../xmlspace/) döndürür. |
| [LookupPrefix](./lookupprefix/)(String) override | Ad alanı URI'si için mevcut ad alanı kapsamında tanımlı en yakın öneki döndürür. |
| [set_Formatting](./set_formatting/)(System::Xml::Formatting) | Çıktının nasıl biçimlendirildiğini gösterir. |
| [set_Indentation](./set_indentation/)(int32_t) | [XmlTextWriter::set_Formatting](./set_formatting/) [Formatting::Indented](../formatting/) olarak ayarlandığında hiyerarşideki her seviye için kaç IndentChars yazılacağını ayarlar. |
| [set_IndentChar](./set_indentchar/)(char16_t) | [XmlTextWriter::set_Formatting](./set_formatting/) [Formatting::Indented](../formatting/) olarak ayarlandığında girinti için hangi karakterin kullanılacağını ayarlar. |
| [set_Namespaces](./set_namespaces/)(bool) | Namespace desteğinin yapılacağını gösteren bir değer ayarlar. |
| [set_QuoteChar](./set_quotechar/)(char16_t) | Özellik değerlerini tırnaklamak için kullanılacak karakteri ayarlar. |
| [WriteBase64](./writebase64/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | Belirtilen ikili baytları base64 olarak kodlar ve ortaya çıkan metni yazar. |
| [WriteBinHex](./writebinhex/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | Belirtilen ikili baytları binhex olarak kodlar ve ortaya çıkan metni yazar. |
| [WriteCData](./writecdata/)(String) override | Belirtilen metni içeren bir **...** bloğu yazar. |
| [WriteCharEntity](./writecharentity/)(char16_t) override | Belirtilen Unicode karakter değeri için bir karakter varlığı oluşturulmasını zorlar. |
| [WriteChars](./writechars/)(ArrayPtr\<char16_t\>, int32_t, int32_t) override | Metni bir seferde bir tampon olarak yazar. |
| [WriteComment](./writecomment/)(String) override | Belirtilen metni içeren bir **** yorumunu yazar. |
| [WriteDocType](./writedoctype/)(const String\&, const String\&, const String\&, const String\&) override | Belirtilen ad ve isteğe bağlı özniteliklerle DOCTYPE bildirimini yazar. |
| [WriteEndAttribute](./writeendattribute/)() override | Önceki [XmlTextWriter::WriteStartAttribute](./writestartattribute/) çağrısını kapatır. |
| [WriteEndDocument](./writeenddocument/)() override | Açık olan tüm öğeleri veya öznitelikleri kapatır ve yazıcıyı Başlangıç durumuna geri koyar. |
| [WriteEndElement](./writeendelement/)() override | Bir öğeyi kapatır ve ilgili namespace kapsamını çıkarır. |
| [WriteEntityRef](./writeentityref/)(const String\&) override | Bir varlık referansını **&name**; olarak yazar. |
| [WriteFullEndElement](./writefullendelement/)() override | Bir öğeyi kapatır ve ilgili namespace kapsamını çıkarır. |
| [WriteName](./writename/)(const String\&) override | Belirtilen adı, [W3C XML 1.0 önerisine](https://www.w3.org/TR/1998/REC-xml-19980210#NT-Name) göre geçerli bir ad olduğundan emin olarak yazar. |
| [WriteNmToken](./writenmtoken/)(const String\&) override | Belirtilen adı, [W3C XML 1.0 önerisine](https://www.w3.org/TR/1998/REC-xml-19980210#NT-Name) göre geçerli bir **NmToken** olduğundan emin olarak yazar. |
| [WriteProcessingInstruction](./writeprocessinginstruction/)(String, String) override | Aşağıdaki gibi, ad ve metin arasında boşluk bulunan bir işleme talimatı yazar: **<?name text?>**. |
| [WriteQualifiedName](./writequalifiedname/)(const String\&, const String\&) override | Namespace nitelikli adı yazar. Bu yöntem, verilen namespace için kapsamda olan önek'i arar. |
| [WriteRaw](./writeraw/)(ArrayPtr\<char16_t\>, int32_t, int32_t) override | Bir karakter tamponundan ham işaretlemeyi manuel olarak yazar. |
| [WriteRaw](./writeraw/)(const String\&) override | Bir dizeden ham işaretlemeyi manuel olarak yazar. |
| [WriteStartAttribute](./writestartattribute/)(const String\&, const String\&, const String\&) override | Bir öznitelik başlangıcını yazar. |
| [WriteStartDocument](./writestartdocument/)() override | Version "1.0" ile XML bildirimini yazar. |
| [WriteStartDocument](./writestartdocument/)(bool) override | Version "1.0" ve standalone özniteliği ile XML bildirimini yazar. |
| [WriteStartElement](./writestartelement/)(const String\&, const String\&, const String\&) override | Belirtilen başlangıç etiketini yazar ve verilen namespace ve önek ile ilişkilendirir. |
| [WriteString](./writestring/)(const String\&) override | Verilen metin içeriğini yazar. |
| [WriteSurrogateCharEntity](./writesurrogatecharentity/)(char16_t, char16_t) override | Surrogate karakter çifti için surrogate karakter varlığını oluşturur ve yazar. |
| [WriteWhitespace](./writewhitespace/)(String) override | Verilen boşluğu yazar. |
| [XmlTextWriter](./xmltextwriter/)(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<Text::Encoding\>\&) | Belirtilen akış ve kodlamayı kullanarak [XmlTextWriter](./) sınıfının bir örneğini oluşturur. |
| [XmlTextWriter](./xmltextwriter/)(const String\&, const SharedPtr\<Text::Encoding\>\&) | Belirtilen dosyayı kullanarak [XmlTextWriter](./) sınıfının bir örneğini oluşturur. |
| [XmlTextWriter](./xmltextwriter/)(const SharedPtr\<IO::TextWriter\>\&) | Belirtilen TextWriter'ı kullanarak [XmlTextWriter](./) sınıfının bir örneğini oluşturur. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [Ptr](./ptr/) | Bu sınıfın bir örneğine ortak gösterici için bir takma addır. |
## Açıklamalar



Bunun yerine [XmlWriter](../xmlwriter/) sınıfını kullanmanız önerilir.

Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Yığını üzerinde veya new operatörüyle bu tipin örneklerini asla oluşturmayın, çünkü bu çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

## Ayrıca Bakınız

* Class [XmlWriter](../xmlwriter/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
