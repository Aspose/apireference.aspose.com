---
title: "System::Xml::XmlWriter sınıfı"
linktitle: "XmlWriter"
second_title: "Aspose.Font için C++"
description: "System::Xml::XmlWriter sınıfı. C++'ta XML verisi içeren akışlar veya dosyalar oluşturmak için hızlı, önbelleğe alınmamış, yalnızca ileriye doğru bir yol sağlayan bir yazar temsil eder."
type: docs
weight: 4400
url: /tr/cpp/system.xml/xmlwriter/
---
## XmlWriter class


XML verisi içeren akışlar veya dosyalar oluşturmak için hızlı, önbelleğe alınmamış, yalnızca ileriye doğru bir yol sağlayan bir yazar temsil eder.

```cpp
class XmlWriter : public System::IDisposable
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| virtual [Close](./close/)() | Türetilmiş bir sınıfta geçersiz kılındığında, bu akışı ve temel akışı kapatır. |
| static [Create](./create/)(const String\&) | Belirtilen dosya adını kullanarak yeni bir [XmlWriter](./) örneği oluşturur. |
| static [Create](./create/)(const String\&, SharedPtr\<XmlWriterSettings\>) | Dosya adı ve [XmlWriterSettings](../xmlwritersettings/) nesnesini kullanarak yeni bir [XmlWriter](./) örneği oluşturur. |
| static [Create](./create/)(const SharedPtr\<IO::Stream\>\&) | Belirtilen akışı kullanarak yeni bir [XmlWriter](./) örneği oluşturur. |
| static [Create](./create/)(const SharedPtr\<IO::Stream\>\&, SharedPtr\<XmlWriterSettings\>) | Akışı ve [XmlWriterSettings](../xmlwritersettings/) nesnesini kullanarak yeni bir [XmlWriter](./) örneği oluşturur. |
| static [Create](./create/)(const SharedPtr\<IO::TextWriter\>\&) | Belirtilen TextWriter'ı kullanarak yeni bir [XmlWriter](./) örneği oluşturur. |
| static [Create](./create/)(const SharedPtr\<IO::TextWriter\>\&, SharedPtr\<XmlWriterSettings\>) | TextWriter ve [XmlWriterSettings](../xmlwritersettings/) nesnelerini kullanarak yeni bir [XmlWriter](./) örneği oluşturur. |
| static [Create](./create/)(const SharedPtr\<Text::StringBuilder\>\&) | Belirtilen [Text::StringBuilder](../../system.text/stringbuilder/) öğesini kullanarak yeni bir [XmlWriter](./) örneği oluşturur. |
| static [Create](./create/)(const SharedPtr\<Text::StringBuilder\>\&, SharedPtr\<XmlWriterSettings\>) | [Text::StringBuilder](../../system.text/stringbuilder/) ve [XmlWriterSettings](../xmlwritersettings/) nesnelerini kullanarak yeni bir [XmlWriter](./) örneği oluşturur. |
| static [Create](./create/)(const SharedPtr\<XmlWriter\>\&) | Belirtilen [XmlWriter](./) nesnesini kullanarak yeni bir [XmlWriter](./) örneği oluşturur. |
| static [Create](./create/)(const SharedPtr\<XmlWriter\>\&, SharedPtr\<XmlWriterSettings\>) | Belirtilen [XmlWriter](./) ve [XmlWriterSettings](../xmlwritersettings/) nesnelerini kullanarak yeni bir [XmlWriter](./) örneği oluşturur. |
| [Dispose](./dispose/)() override | Mevcut [XmlWriter](./) sınıfı örneği tarafından kullanılan tüm kaynakları serbest bırakır. |
| virtual [Flush](./flush/)() | Türetilmiş bir sınıfta geçersiz kılındığında, tampondaki her şeyi temel akımlara boşaltır ve ayrıca temel akımı da boşaltır. |
| virtual [get_Settings](./get_settings/)() | Bu [XmlWriter](./) örneğini oluşturmak için kullanılan [XmlWriterSettings](../xmlwritersettings/) nesnesini döndürür. |
| virtual [get_WriteState](./get_writestate/)() | Türetilmiş bir sınıfta geçersiz kılındığında, yazıcının durumunu alır. |
| virtual [get_XmlLang](./get_xmllang/)() | Türetilmiş bir sınıfta geçersiz kılındığında, geçerli **xml:lang** kapsamını alır. |
| virtual [get_XmlSpace](./get_xmlspace/)() | Türetilmiş bir sınıfta geçersiz kılındığında, mevcut **xml:space** kapsamını temsil eden bir [XmlSpace](../xmlspace/) alır. |
| virtual [LookupPrefix](./lookupprefix/)(String) | Türetilmiş bir sınıfta geçersiz kılındığında, ad alanı URI'si için mevcut ad alanı kapsamında tanımlı en yakın öneki döndürür. |
| virtual [WriteAttributes](./writeattributes/)(SharedPtr\<XmlReader\>, bool) | Türetilmiş bir sınıfta geçersiz kılındığında, [XmlReader](../xmlreader/) içindeki geçerli konumda bulunan tüm öznitelikleri yazar. |
| [WriteAttributeString](./writeattributestring/)(const String\&, const String\&, const String\&) | Türetilmiş bir sınıfta geçersiz kılındığında, belirtilen yerel ad, ad alanı URI'si ve değer ile bir öznitelik yazar. |
| [WriteAttributeString](./writeattributestring/)(const String\&, const String\&) | Türetilmiş bir sınıfta geçersiz kılındığında, belirtilen yerel ad ve değer ile özniteliği yazar. |
| [WriteAttributeString](./writeattributestring/)(const String\&, const String\&, const String\&, const String\&) | Türetilmiş bir sınıfta geçersiz kılındığında, belirtilen önek, yerel ad, ad alanı URI'si ve değer ile özniteliği yazar. |
| virtual [WriteBase64](./writebase64/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) | Türetilmiş bir sınıfta geçersiz kılındığında, belirtilen ikili baytları Base64 olarak kodlar ve ortaya çıkan metni yazar. |
| virtual [WriteBinHex](./writebinhex/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) | Türetilmiş bir sınıfta geçersiz kılındığında, belirtilen ikili baytları **BinHex** olarak kodlar ve ortaya çıkan metni yazar. |
| virtual [WriteCData](./writecdata/)(String) | Türetilmiş bir sınıfta geçersiz kılındığında, belirtilen metni içeren bir **...** bloğu yazar. |
| virtual [WriteCharEntity](./writecharentity/)(char16_t) | Türetilmiş bir sınıfta geçersiz kılındığında, belirtilen Unicode karakter değeri için bir karakter varlığı oluşturulmasını zorlar. |
| virtual [WriteChars](./writechars/)(ArrayPtr\<char16_t\>, int32_t, int32_t) | Türetilmiş bir sınıfta geçersiz kılındığında, metni bir seferde bir tampon olarak yazar. |
| virtual [WriteComment](./writecomment/)(String) | Türetilmiş bir sınıfta geçersiz kılındığında, belirtilen metni içeren bir yorum **** yazar. |
| virtual [WriteDocType](./writedoctype/)(const String\&, const String\&, const String\&, const String\&) | Türetilmiş bir sınıfta geçersiz kılındığında, belirtilen ad ve isteğe bağlı özniteliklerle DOCTYPE bildirimini yazar. |
| [WriteElementString](./writeelementstring/)(const String\&, const String\&) | Belirtilen yerel ad ve değerle bir öğe yazar. |
| [WriteElementString](./writeelementstring/)(const String\&, const String\&, const String\&) | Belirtilen yerel ad, ad alanı URI'si ve değerle bir öğe yazar. |
| [WriteElementString](./writeelementstring/)(const String\&, const String\&, const String\&, const String\&) | Belirtilen önek, yerel ad, ad alanı URI'si ve değerle bir öğe yazar. |
| virtual [WriteEndAttribute](./writeendattribute/)() | Türetilmiş bir sınıfta geçersiz kılındığında, önceki XmlWriter::WriteStartAttribute(String,String) çağrısını kapatır. |
| virtual [WriteEndDocument](./writeenddocument/)() | Türetilmiş bir sınıfta geçersiz kılındığında, açık olan tüm öğeleri veya öznitelikleri kapatır ve yazıcıyı Başlangıç durumuna geri koyar. |
| virtual [WriteEndElement](./writeendelement/)() | Türetilmiş bir sınıfta geçersiz kılındığında, bir öğeyi kapatır ve ilgili ad alanı kapsamını çıkarır. |
| virtual [WriteEntityRef](./writeentityref/)(const String\&) | Türetilmiş bir sınıfta geçersiz kılındığında, bir varlık referansını **&name**; olarak yazar. |
| virtual [WriteFullEndElement](./writefullendelement/)() | Türetilmiş bir sınıfta geçersiz kılındığında, bir öğeyi kapatır ve ilgili ad alanı kapsamını çıkarır. |
| virtual [WriteName](./writename/)(const String\&) | Türetilmiş bir sınıfta geçersiz kılındığında, belirtilen adı yazar ve bunun W3C XML 1.0 önerisine göre geçerli bir ad olduğundan emin olur ([https://www.w3.org/TR/1998/REC-xml-19980210#NT-Name](https://www.w3.org/TR/1998/REC-xml-19980210#NT-Name)). |
| virtual [WriteNmToken](./writenmtoken/)(const String\&) | Türetilmiş bir sınıfta geçersiz kılındığında, belirtilen adı yazar ve bunun W3C XML 1.0 önerisine göre geçerli bir NmToken olduğundan emin olur ([https://www.w3.org/TR/1998/REC-xml-19980210#NT-Name](https://www.w3.org/TR/1998/REC-xml-19980210#NT-Name)). |
| virtual [WriteNode](./writenode/)(SharedPtr\<XmlReader\>, bool) | Türetilmiş bir sınıfta geçersiz kılındığında, okuyucudan yazıcıya her şeyi kopyalar ve okuyucuyu bir sonraki kardeşin başlangıcına taşır. |
| virtual [WriteNode](./writenode/)(SharedPtr\<XPath::XPathNavigator\>, bool) | XPathNavigator nesnesinden yazıcıya her şeyi kopyalar. XPathNavigator konumu değişmeden kalır. |
| virtual [WriteProcessingInstruction](./writeprocessinginstruction/)(String, String) | Türetilmiş bir sınıfta geçersiz kılındığında, ad ile metin arasında bir boşluk bırakarak aşağıdaki gibi bir işleme talimatı yazar: **<?name text?>**. |
| virtual [WriteQualifiedName](./writequalifiedname/)(const String\&, const String\&) | Türetilmiş bir sınıfta geçersiz kılındığında, ad alanı nitelikli adı yazar. Bu yöntem, verilen ad alanı için kapsamda olan öneki arar. |
| virtual [WriteRaw](./writeraw/)(ArrayPtr\<char16_t\>, int32_t, int32_t) | Türetilmiş bir sınıfta geçersiz kılındığında, karakter tamponundan ham işaretlemeyi elle yazar. |
| virtual [WriteRaw](./writeraw/)(const String\&) | Türetilmiş bir sınıfta geçersiz kılındığında, bir dizeden ham işaretlemeyi elle yazar. |
| [WriteStartAttribute](./writestartattribute/)(const String\&, const String\&) | Belirtilen yerel ad ve ad alanı URI'si ile bir öznitelik başlangıcını yazar. |
| virtual [WriteStartAttribute](./writestartattribute/)(const String\&, const String\&, const String\&) | Türetilmiş bir sınıfta geçersiz kılındığında, belirtilen önek, yerel ad ve ad alanı URI'si ile bir öznitelik başlangıcını yazar. |
| [WriteStartAttribute](./writestartattribute/)(const String\&) | Belirtilen yerel ad ile bir öznitelik başlangıcını yazar. |
| virtual [WriteStartDocument](./writestartdocument/)() | Türetilmiş bir sınıfta geçersiz kılındığında, "1.0" sürümüyle XML bildirimini yazar. |
| virtual [WriteStartDocument](./writestartdocument/)(bool) | Türetilmiş bir sınıfta geçersiz kılındığında, "1.0" sürümü ve standalone özniteliğiyle XML bildirimini yazar. |
| [WriteStartElement](./writestartelement/)(const String\&, const String\&) | Türetilmiş bir sınıfta geçersiz kılındığında, belirtilen başlangıç etiketini yazar ve verilen ad alanıyla ilişkilendirir. |
| virtual [WriteStartElement](./writestartelement/)(const String\&, const String\&, const String\&) | Türetilmiş bir sınıfta geçersiz kılındığında, belirtilen başlangıç etiketini yazar ve verilen ad alanı ve önekle ilişkilendirir. |
| [WriteStartElement](./writestartelement/)(const String\&) | Türetilmiş bir sınıfta geçersiz kılındığında, belirtilen yerel adla bir başlangıç etiketi yazar. |
| virtual [WriteString](./writestring/)(const String\&) | Türetilmiş bir sınıfta geçersiz kılındığında, verilen metin içeriğini yazar. |
| virtual [WriteSurrogateCharEntity](./writesurrogatecharentity/)(char16_t, char16_t) | Türetilmiş bir sınıfta geçersiz kılındığında, yedek karakter çiftinin yedek karakter varlığını oluşturur ve yazar. |
| virtual [WriteValue](./writevalue/)(SharedPtr\<Object\>) | Nesne değerini yazar. |
| virtual [WriteValue](./writevalue/)(const String\&) | [String](../../system/string/) değerini yazar. |
| virtual [WriteValue](./writevalue/)(bool) | [Boolean](../../system/boolean/) değerini yazar. |
| virtual [WriteValue](./writevalue/)(DateTime) | [DateTime](../../system/datetime/) değerini yazar. |
| virtual [WriteValue](./writevalue/)(DateTimeOffset) | [DateTimeOffset](../../system/datetimeoffset/) değerini yazar. |
| virtual [WriteValue](./writevalue/)(double) | [Double](../../system/double/) değerini yazar. |
| virtual [WriteValue](./writevalue/)(float) | Tek duyarlıklı kayan nokta sayısını yazar. |
| virtual [WriteValue](./writevalue/)(Decimal) | [Decimal](../../system/decimal/) değerini yazar. |
| virtual [WriteValue](./writevalue/)(int32_t) | [Int32](../../system/int32/) değerini yazar. |
| virtual [WriteValue](./writevalue/)(int64_t) | Bir [Int64](../../system/int64/) değeri yazar. |
| virtual [WriteWhitespace](./writewhitespace/)(String) | Türetilmiş bir sınıfta geçersiz kılındığında, verilen boşluk karakterini yazar. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [Ptr](./ptr/) | Bu sınıfın bir örneğine ortak gösterici için bir takma ad. |
## Ayrıca Bakınız

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
