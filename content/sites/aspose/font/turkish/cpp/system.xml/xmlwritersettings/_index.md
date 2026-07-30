---
title: "System::Xml::XmlWriterSettings class"
linktitle: "XmlWriterSettings"
second_title: "Aspose.Font için C++"
description: "System::Xml::XmlWriterSettings sınıfı. C++'de XmlWriter::Create yöntemiyle oluşturulan XmlWriter nesnesi üzerinde desteklenecek bir dizi özelliği belirtir."
type: docs
weight: 4500
url: /tr/cpp/system.xml/xmlwritersettings/
---
## XmlWriterSettings class


[XmlWriter](../xmlwriter/) nesnesi üzerinde, [XmlWriter::Create](../xmlwriter/create/) yöntemiyle oluşturulan bir dizi özelliği destekleyecek şekilde belirtir.

```cpp
class XmlWriterSettings : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Clone](./clone/)() | [XmlWriterSettings](./) örneğinin bir kopyasını oluşturur. |
| [get_CheckCharacters](./get_checkcharacters/)() | XML yazarının, belgedeki tüm karakterlerin W3C [XML 1.0 Recommendation](https://www.w3.org/TR/REC-xml/#charsets) belgesinin "2.2 Characters" bölümüne uygun olup olmadığını kontrol etmesi gerekip gerekmediğini gösteren bir değer döndürür. |
| [get_CloseOutput](./get_closeoutput/)() | [XmlWriter](../xmlwriter/) nesnesinin, [XmlWriter::Close](../xmlwriter/close/) yöntemi çağrıldığında temel akışı veya TextWriter'ı da kapatıp kapatmayacağını gösteren bir değer döndürür. |
| [get_ConformanceLevel](./get_conformancelevel/)() | XML yazarının XML çıktısını kontrol ettiği uyumluluk seviyesini döndürür. |
| [get_DoNotEscapeUriAttributes](./get_donotescapeuriattributes/)() | [XmlWriter](../xmlwriter/) nesnesinin URI özniteliklerini kaçırmadığını gösteren bir değer döndürür. |
| [get_Encoding](./get_encoding/)() | Kullanılacak metin kodlaması türünü döndürür. |
| [get_Indent](./get_indent/)() | Elemanları girintileme gerekip gerekmediğini gösteren bir değer döndürür. |
| [get_IndentChars](./get_indentchars/)() | Girintileme sırasında kullanılacak karakter dizisini döndürür. Bu ayar, [XmlWriterSettings::set_Indent](./set_indent/) değeri **true** olarak ayarlandığında kullanılır. |
| [get_NamespaceHandling](./get_namespacehandling/)() | [XmlWriter](../xmlwriter/) nesnesinin XML içeriği yazılırken yinelenen ad alanı bildirimlerini kaldırıp kaldırmayacağını gösteren bir değer döndürür. Varsayılan davranış, yazarın ad alanı çözücüsünde bulunan tüm ad alanı bildirimlerini çıkarmaktır. |
| [get_NewLineChars](./get_newlinechars/)() | Satır sonları için kullanılacak karakter dizisini döndürür. |
| [get_NewLineHandling](./get_newlinehandling/)() | Çıktıda satır sonlarını normalleştirip normalleştirilmeyeceğini gösteren bir değer döndürür. |
| [get_NewLineOnAttributes](./get_newlineonattributes/)() | Yeni bir satırda öznitelikleri yazıp yazmayacağını gösteren bir değer döndürür. |
| [get_OmitXmlDeclaration](./get_omitxmldeclaration/)() | XML bildirimi atlanıp atlanmayacağını gösteren bir değer döndürür. |
| [get_OutputMethod](./get_outputmethod/)() | [XmlWriter](../xmlwriter/) çıktısını serileştirmek için kullanılan yöntemi döndürür. |
| [get_WriteEndDocumentOnClose](./get_writeenddocumentonclose/)() | [XmlWriter](../xmlwriter/) kapanış yöntemi [XmlWriter::Close](../xmlwriter/close/) çağrıldığında, kapatılmamış tüm öğe etiketlerine kapanış etiketleri ekleyip eklemeyeceğini gösteren bir değer döndürür. |
| [Reset](./reset/)() | Ayarlar sınıfının üyelerini varsayılan değerlerine sıfırlar. |
| [set_CheckCharacters](./set_checkcharacters/)(bool) | XML yazarının, belgedeki tüm karakterlerin W3C [XML 1.0 Recommendation](https://www.w3.org/TR/REC-xml/#charsets) "2.2 Characters" bölümüne uygun olup olmadığını kontrol etmesi gerektiğini gösteren bir değer ayarlar. |
| [set_CloseOutput](./set_closeoutput/)(bool) | [XmlWriter](../xmlwriter/) kapanış yöntemi [XmlWriter::Close](../xmlwriter/close/) çağrıldığında, temel akışı veya TextWriter'ı da kapatıp kapatmayacağını gösteren bir değer ayarlar. |
| [set_ConformanceLevel](./set_conformancelevel/)(System::Xml::ConformanceLevel) | XML yazarının XML çıktısını denetlediği uyumluluk seviyesini ayarlar. |
| [set_DoNotEscapeUriAttributes](./set_donotescapeuriattributes/)(bool) | [XmlWriter](../xmlwriter/) URI özniteliklerini kaçırmayacağını gösteren bir değer ayarlar. |
| [set_Encoding](./set_encoding/)(const SharedPtr\<System::Text::Encoding\>\&) | Kullanılacak metin kodlaması türünü ayarlar. |
| [set_Indent](./set_indent/)(bool) | Ögeleri girintileyeceğini gösteren bir değer ayarlar. |
| [set_IndentChars](./set_indentchars/)(const String\&) | Girintileme sırasında kullanılacak karakter dizisini ayarlar. Bu ayar, [XmlWriterSettings::set_Indent](./set_indent/) değeri **true** olarak ayarlandığında kullanılır. |
| [set_NamespaceHandling](./set_namespacehandling/)(System::Xml::NamespaceHandling) | [XmlWriter](../xmlwriter/) XML içeriği yazarken yinelenen ad alanı bildirimlerini kaldırıp kaldırmayacağını gösteren bir değer ayarlar. Varsayılan davranış, yazarın ad alanı çözücüsünde bulunan tüm ad alanı bildirimlerini çıkarmaktır. |
| [set_NewLineChars](./set_newlinechars/)(const String\&) | Satır sonları için kullanılacak karakter dizisini ayarlar. |
| [set_NewLineHandling](./set_newlinehandling/)(System::Xml::NewLineHandling) | Çıktıda satır sonlarını normalleştirip normalleştirmeyeceğini gösteren bir değer ayarlar. |
| [set_NewLineOnAttributes](./set_newlineonattributes/)(bool) | Öznitelikleri yeni bir satırda yazıp yazmayacağını gösteren bir değer ayarlar. |
| [set_OmitXmlDeclaration](./set_omitxmldeclaration/)(bool) | XML bildirimini atlayıp atlamayacağını gösteren bir değer ayarlar. |
| [set_WriteEndDocumentOnClose](./set_writeenddocumentonclose/)(bool) | [XmlWriter](../xmlwriter/) kapanış yöntemi [XmlWriter::Close](../xmlwriter/close/) çağrıldığında, kapatılmamış tüm öğe etiketlerine kapanış etiketleri ekleyip eklemeyeceğini gösteren bir değer ayarlar. |
| [XmlWriterSettings](./xmlwritersettings/)() | [XmlWriterSettings](./) sınıfının yeni bir örneğini başlatır. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [Ptr](./ptr/) | Bu sınıfın bir örneğine ortak gösterici için bir takma ad. |
## Açıklamalar



Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu türden örnekleri yığıt üzerinde veya new operatörüyle oluşturmayın, çünkü bu çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) göstericisine sarın ve bu göstericiyi fonksiyonlara argüman olarak geçirmek için kullanın.

## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
