---
title: "System::IO::File sınıfı"
linktitle: "File"
second_title: "Aspose.Page için C++"
description: "System::IO::File sınıfı. Dosyalarla çalışmak için yöntemler sağlar. Bu, örnek hizmeti olmayan statik bir türdür. C++'ta hiçbir şekilde onun örneklerini oluşturmamalısınız."
type: docs
weight: 1300
url: /tr/cpp/system.io/file/
---
## File class


Dosyaları işlemek için yöntemler sağlar. Bu, örnek hizmeti olmayan statik bir türdür. Herhangi bir şekilde onun örneklerini asla oluşturmamalısınız.

```cpp
class File
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| static [AppendAllLines](./appendalllines/)(const String\&, const SharedPtr\<Collections::Generic::IEnumerable\<String\>\>\&, const EncodingPtr\&) | Belirtilen kodlama kullanılarak, belirtilen dize koleksiyonundaki dizeleri belirtilen dosyaya her birini yeni bir satıra yazarak ekler. Belirtilen dosya mevcut değilse, oluşturulur. Tüm dizeler yazıldıktan sonra dosya kapatılır. |
| static [AppendAllText](./appendalltext/)(const String\&, const String\&, const EncodingPtr\&) | Belirtilen kodlamayı kullanarak belirtilen dizeyi belirtilen dosyaya ekler. |
| static [AppendText](./appendtext/)(const String\&) | UTF-8 kodlamasını kullanarak belirtilen dosyaya metin ekleyen bir [StreamWriter](../streamwriter/) nesnesi oluşturur. Belirtilen dosya mevcut değilse, oluşturulur. |
| static [Copy](./copy/)(const String\&, const String\&, bool) | Belirtilen dosyayı belirtilen konuma kopyalar. Hedef dosya zaten mevcutsa, bir parametre onun üzerine yazılıp yazılmayacağını belirler. |
| static [Create](./create/)(const String\&, int32_t, FileOptions) | Belirtilen tampon boyutu ve seçenekler kullanılarak yeni bir dosya (veya mevcut olanı üzerine yazar) oluşturur ve okuma‑yazma erişimi için açar. |
| static [CreateText](./createtext/)(const String\&) | UTF-8 kodlu metin yazmak için yeni bir dosya oluşturur veya mevcut dosyayı açar. |
| static [Decrypt](./decrypt/)(const String\&) | UYGULANMADI. |
| static [Delete](./delete/)(const String\&) | Belirtilen dosya veya dizini siler. |
| static [Encrypt](./encrypt/)(const String\&) | UYGULANMADI. |
| static [Exists](./exists/)(const String\&) | Belirtilen yolun mevcut bir dosyaya işaret edip etmediğini belirler. |
| static [GetAttributes](./getattributes/)(const String\&) | Belirtilen varlığın özniteliklerini döndürür. |
| static [GetCreationTime](./getcreationtime/)(const String\&) | Belirtilen varlığın oluşturulma zamanını yerel saat olarak döndürür. |
| static [GetCreationTimeUtc](./getcreationtimeutc/)(const String\&) | Belirtilen varlığın oluşturulma zamanını UTC saat olarak döndürür. |
| static [GetLastAccessTime](./getlastaccesstime/)(const String\&) | Belirtilen varlığın son erişim zamanını yerel saat olarak döndürür. |
| static [GetLastAccessTimeUtc](./getlastaccesstimeutc/)(const String\&) | Belirtilen varlığın son erişim zamanını UTC saat olarak döndürür. |
| static [GetLastWriteTime](./getlastwritetime/)(const String\&) | Belirtilen varlığın son yazma zamanını yerel saat olarak döndürür. |
| static [GetLastWriteTimeUtc](./getlastwritetimeutc/)(const String\&) | Belirtilen varlığın son yazma zamanını UTC saat olarak döndürür. |
| static [Move](./move/)(const String\&, const String\&) | Belirtilen dosyayı yeni konuma taşır. |
| static [Open](./open/)(const String\&, FileMode) | Belirtilen dosyayı belirtilen modda okuma ve yazma için, paylaşım olmadan açar. |
| static [Open](./open/)(const String\&, FileMode, FileAccess, FileShare) | Belirtilen dosyayı belirtilen modda, belirtilen erişim türü ve paylaşım seçeneğiyle açar. |
| static [OpenRead](./openread/)(const String\&) | Belirtilen dosyayı yalnızca okuma için, 'Open' modunda, okuma için paylaşımlı erişimle açar. |
| static [OpenText](./opentext/)(const String\&, const EncodingPtr\&) | Belirtilen mevcut dosyayı UTF-8 kodlamasıyla, paylaşım olmadan metin okuma için açar. |
| static [OpenWrite](./openwrite/)(const String\&) | Belirtilen dosyayı yalnızca yazma için, 'OpenOrCreate' modunda, paylaşım olmadan açar. |
| static [ReadAllBytes](./readallbytes/)(const String\&) | Belirtilen ikili dosyanın içeriğini bir bayt dizisine okur. |
| static [ReadAllLines](./readalllines/)(const String\&, const EncodingPtr\&) | Belirtilen metin dosyasının içeriğini satır satır, belirtilen karakter kodlamasını kullanarak bir dizi stringe okur. |
| static [ReadAllText](./readalltext/)(const String\&, const EncodingPtr\&) | Belirtilen metin dosyasının içeriğini belirtilen karakter kodlamasını kullanarak tek bir [String](../../system/string/) nesnesine okur. |
| static [ReadLines](./readlines/)(const String\&, const EncodingPtr\&) | Belirtilen metin dosyasının içeriğini satır satır, belirtilen karakter kodlamasını kullanarak okur ve her biri dosyanın tek bir satırını temsil eden stringlerden oluşan bir enumerable koleksiyon döndürür. |
| static [Replace](./replace/)(const String\&, const String\&, const String\&, bool) | Bir dosyanın içeriğini başka bir dosyayla değiştirir ve değiştirilen dosyanın bir yedeğini oluşturur. |
| static [SetAttributes](./setattributes/)(const String\&, FileAttributes) | Belirtilen dosyada belirtilen öznitelikleri ayarlar. |
| static [SetCreationTime](./setcreationtime/)(const String\&, DateTime) | UYGULANMADI. |
| static [SetCreationTimeUtc](./setcreationtimeutc/)(const String\&, DateTime) | UYGULANMADI. |
| static [SetLastAccessTime](./setlastaccesstime/)(const String\&, DateTime) | UYGULANMADI. |
| static [SetLastAccessTimeUtc](./setlastaccesstimeutc/)(const String\&, DateTime) | UYGULANMADI. |
| static [SetLastWriteTime](./setlastwritetime/)(const String\&, DateTime) | Belirtilen varlığın son yazma zamanını yerel saat olarak ayarlar. |
| static [SetLastWriteTimeUtc](./setlastwritetimeutc/)(const String\&, DateTime) | Belirtilen varlığın son yazma zamanını UTC saat olarak ayarlar. |
| static [WriteAllBytes](./writeallbytes/)(const String\&, const ArrayPtr\<uint8_t\>\&) | Belirtilen ikili dosyanın üzerine yazar ve belirtilen baytları ona yazar. |
| static [WriteAllLines](./writealllines/)(const String\&, const SharedPtr\<Collections::Generic::IEnumerable\<String\>\>\&, const EncodingPtr\&) | Belirtilen kodlamayı kullanarak yeni bir metin dosyası oluşturur veya mevcut dosyanın üzerine yazar ve belirtilen enumerable string koleksiyonundaki tüm stringleri dosyaya yazar, her string yeni bir satıra. |
| static [WriteAllLines](./writealllines/)(const String\&, const ArrayPtr\<String\>\&, const EncodingPtr\&) | Belirtilen kodlamayı kullanarak yeni bir metin dosyası oluşturur veya mevcut dosyanın üzerine yazar ve belirtilen dizi stringindeki tüm stringleri dosyaya yazar, her string yeni bir satıra. |
| static [WriteAllText](./writealltext/)(const String\&, const String\&, const EncodingPtr\&) | Belirtilen kodlamayı kullanarak yeni bir metin dosyası oluşturur veya mevcut dosyanın üzerine yazar ve belirtilen stringin içeriğini dosyaya yazar. |
## Alanlar

| Alan | Açıklama |
| --- | --- |
| static [DefaultBufferSize](./defaultbuffersize/) | Bir dosyadan okuma ve dosyaya yazma sırasında tamponlanan bayt sayısının varsayılan değeri. |
## Ayrıca Bakınız

* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
