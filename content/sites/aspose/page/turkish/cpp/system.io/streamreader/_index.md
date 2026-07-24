---
title: "System::IO::StreamReader class"
linktitle: "StreamReader"
second_title: "Aspose.Page için C++"
description: "System::IO::StreamReader class. Bayt akışından karakter okuyan bir okuyucuyu temsil eder. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek hiçbir zaman yığıt (stack) üzerinde veya operator new kullanılarak oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Her zaman bu sınıfı System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 2200
url: /tr/cpp/system.io/streamreader/
---
## StreamReader class


Bayt akışından karakter okuyan bir okuyucuyu temsil eder. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek hiçbir zaman yığıt üzerinde veya operator new kullanılarak oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Her zaman bu sınıfı [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class StreamReader : public System::IO::TextReader
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Close](./close/)() override | Mevcut ve temel akışları kapatır. |
| [Dispose](./dispose/)() override | Geçerli nesne tarafından kullanılan tüm kaynakları serbest bırakır ve temel akışı kapatır. |
| [get_BaseStream](./get_basestream/)() const | Temel akışı temsil eden bir nesneye ortak işaretçi döndürür. |
| [get_CurrentEncoding](./get_currentencoding/)() | Şu anda kullanılan kodlamayı döndürür. |
| [get_EndOfStream](./get_endofstream/)() | Akışın sonuna ulaşılıp ulaşılmadığını gösteren bir değer döndürür. |
| [Peek](./peek/)() override | Akışın okuma imlecini değiştirmeden akıştan tek bir karakter okur. |
| [Read](./read/)() override | Akıştan tek bir karakter okur. |
| [Read](./read/)(ArrayPtr\<char_t\>, int, int) override | Belirtilen sayıda karakteri akıştan okur, UTF-16 kodlamasına dönüştürür ve elde edilen UTF-16 karakterlerini belirtilen konumdan başlayarak belirtilen karakter dizisine yazar. |
| [ReadLine](./readline/)() override | Akıştan karakterleri, geçerli satırın sonuna kadar okur. |
| [ReadToEnd](./readtoend/)() override | Akıştan karakterleri, akışın sonuna kadar okur. |
| [StreamReader](./streamreader/)(const SharedPtr\<Stream\>\&) | Belirtilen temel akıştan karakter okuyan ve UTF-8 kodlamasını kullanan, varsayılan 1024 bayt boyutunda bir tamponla bir [StreamReader](./) nesnesi oluşturur. |
| [StreamReader](./streamreader/)(const SharedPtr\<Stream\>\&, bool) | Belirtilen temel akıştan karakter okuyan ve UTF-8 kodlamasını kullanan, varsayılan 1024 bayt boyutunda bir tamponla bir [StreamReader](./) nesnesi oluşturur. Bir parametre, bayt sırası işareti algılamasının etkinleştirilip etkinleştirilmeyeceğini belirtir. |
| [StreamReader](./streamreader/)(const SharedPtr\<Stream\>\&, const EncodingPtr\&) | Belirtilen temel akıştan karakter okuyan, belirtilen kodlamayı kullanan ve varsayılan 1024 bayt boyutunda bir tamponla bir [StreamReader](./) nesnesi oluşturur. |
| [StreamReader](./streamreader/)(const SharedPtr\<Stream\>\&, const EncodingPtr\&, bool) | Belirtilen temel akıştan karakter okuyan, belirtilen kodlamayı kullanan ve varsayılan 1024 bayt boyutunda bir tamponla bir [StreamReader](./) nesnesi oluşturur. Bir parametre, bayt sırası işareti algılamasının etkinleştirilip etkinleştirilmeyeceğini belirtir. |
| [StreamReader](./streamreader/)(const SharedPtr\<Stream\>\&, const EncodingPtr\&, bool, int) | Belirtilen temel akıştan karakter okuyan, belirtilen kodlamayı kullanan ve belirtilen boyutta bir tamponla bir [StreamReader](./) nesnesi oluşturur. Bir parametre, bayt sırası işareti algılamasının etkinleştirilip etkinleştirilmeyeceğini belirtir. |
| [StreamReader](./streamreader/)(const System::String\&) | Belirtilen dosyadan karakter okuyan, UTF-8 kodlamasını kullanan ve varsayılan 4096 bayt boyutunda bir tamponla bir [StreamReader](./) nesnesi oluşturur. |
| [StreamReader](./streamreader/)(const System::String\&, bool) | Belirtilen dosyadan karakterleri UTF-8 kodlamasıyla okuyan ve varsayılan 4096 bayt boyutundaki bir tampon kullanan bir [StreamReader](./) nesnesi örneği oluşturur. Bir parametre, bayt sırası işareti algılamasının etkinleştirilip etkinleştirilmeyeceğini belirtir. |
| [StreamReader](./streamreader/)(const System::String\&, const EncodingPtr\&) | Belirtilen dosyadan karakterleri belirtilen kodlamayla ve varsayılan 4096 bayt boyutundaki bir tampon kullanarak okuyan bir [StreamReader](./) nesnesi örneği oluşturur. |
| [StreamReader](./streamreader/)(const System::String\&, const EncodingPtr\&, bool) | Belirtilen temel akıştan karakterleri belirtilen kodlamayla ve varsayılan 4096 bayt boyutundaki bir tampon kullanarak okuyan bir [StreamReader](./) nesnesi örneği oluşturur. Bir parametre, bayt sırası işareti algılamasının etkinleştirilip etkinleştirilmeyeceğini belirtir. |
| [StreamReader](./streamreader/)(const System::String\&, const EncodingPtr\&, bool, int) | Belirtilen dosyadan karakterleri belirtilen kodlamayla ve belirtilen boyuttaki bir tampon kullanarak okuyan bir [StreamReader](./) nesnesi örneği oluşturur. Bir parametre, bayt sırası işareti algılamasının etkinleştirilip etkinleştirilmeyeceğini belirtir. |
| [~StreamReader](./~streamreader/)() | Yıkıcı. |
## Ayrıca Bakınız

* Class [TextReader](../textreader/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
