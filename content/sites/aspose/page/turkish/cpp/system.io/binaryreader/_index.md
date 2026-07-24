---
title: "System::IO::BinaryReader sınıfı"
linktitle: "BinaryReader"
second_title: "Aspose.Page için C++"
description: "System::IO::BinaryReader sınıfı. Belirli bir kodlamada ilkel veri tiplerini ikili veri olarak okuyan bir okuyucuyu temsil eder. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığına (stack) veya new operatörüyle oluşturmaktan kaçının; bu, çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 800
url: /tr/cpp/system.io/binaryreader/
---
## BinaryReader class


Belirli bir kodlamada ilkel veri tiplerini ikili veri olarak okuyan bir okuyucuyu temsil eder. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığına (stack) veya new operatörüyle oluşturmaktan kaçının; bu, çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class BinaryReader : public System::IDisposable
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [BinaryReader](./binaryreader/)(const SharedPtr\<Stream\>\&) | Belirtilen akıştan UTF-8 kodlamasını kullanarak veri okuyan [BinaryReader](./) sınıfının bir örneğini oluşturur. |
| [BinaryReader](./binaryreader/)(const SharedPtr\<Stream\>\&, const SharedPtr\<Text::Encoding\>\&) | Belirtilen akıştan belirtilen kodlamayı kullanarak veri okuyan [BinaryReader](./) sınıfının bir örneğini oluşturur. |
| [BinaryReader](./binaryreader/)(const SharedPtr\<Stream\>\&, const SharedPtr\<Text::Encoding\>\&, bool) | Belirtilen akıştan belirtilen kodlamayı kullanarak veri okuyan [BinaryReader](./) sınıfının bir örneğini oluşturur. |
| virtual [Close](./close/)() | Mevcut [BinaryReader](./) nesnesini ve altında yatan giriş akışını kapatır. |
| [Dispose](./dispose/)() override | Geçerli nesne tarafından kullanılan tüm kaynakları serbest bırakır ve temel akışı kapatır. |
| virtual [get_BaseStream](./get_basestream/)() | Giriş akışını döndürür. |
| virtual [PeekChar](./peekchar/)() | Akışın okuma imlecini değiştirmeden giriş akışından tek bir karakter okur. |
| virtual [Read](./read/)() | Giriş akışından tek bir karakter okur. |
| virtual [Read](./read/)(ArrayPtr\<uint8_t\>, int, int) | Giriş akışından belirtilen sayıda baytı okur ve bunları belirtilen bayt dizisine yazar. |
| virtual [Read](./read/)(ArrayPtr\<char_t\>, int, int) | Giriş akışından belirtilen sayıda karakteri okur, bunları UTF-16 kodlamasına dönüştürür ve elde edilen UTF-16 karakterlerini belirtilen konumdan başlayarak belirtilen karakter dizisine yazar. |
| virtual [ReadBoolean](./readboolean/)() | Giriş akışından tek bir bayt okur ve onun boolean temsilini döndürür. |
| virtual [ReadByte](./readbyte/)() | Giriş akışından tek bir bayt okur. |
| virtual [ReadBytes](./readbytes/)(int) | Giriş akışından belirtilen sayıda baytı okur. |
| virtual [ReadChar](./readchar/)() | Giriş akışından tek bir karakter okur. |
| virtual [ReadChars](./readchars/)(int) | Giriş akışından belirtilen sayıda karakteri okur ve bunları UTF-16 kodlamasında döndürür. |
| virtual [ReadDecimal](./readdecimal/)() | UYGULANMADI. |
| virtual [ReadDouble](./readdouble/)() | Giriş akışından 8 baytı okur ve bunları çift duyarlıklı kayan nokta değeri olarak döndürür. |
| virtual [ReadInt16](./readint16/)() | Giriş akışından 2 baytı okur ve bunları 16 bitlik tam sayı değeri olarak döndürür. |
| virtual [ReadInt32](./readint32/)() | Giriş akışından 4 bayt okur ve bunları 32 bitlik bir tam sayı değeri olarak döndürür. |
| virtual [ReadInt64](./readint64/)() | Giriş akışından 8 bayt okur ve bunları 64 bitlik bir tam sayı değeri olarak döndürür. |
| virtual [ReadSByte](./readsbyte/)() | Giriş akışından tek bir bayt okur ve bunu işaretli 8 bitlik bir tam sayı değeri olarak döndürür. |
| virtual [ReadSingle](./readsingle/)() | Giriş akışından 4 bayt okur ve bunları tek duyarlıklı kayan nokta değeri olarak döndürür. |
| virtual [ReadString](./readstring/)() | Mevcut akıştan bir dize okur. Dize, uzunluğu bir tamsayı olarak, her seferinde yedi bitlik parçalar halinde kodlanmış bir önek içerir. |
| virtual [ReadUInt16](./readuint16/)() | Giriş akışından 2 bayt okur ve bunları işaretsiz 16 bitlik bir tam sayı değeri olarak döndürür. |
| virtual [ReadUInt32](./readuint32/)() | Giriş akışından 4 bayt okur ve bunları işaretsiz 32 bitlik bir tam sayı değeri olarak döndürür. |
| virtual [ReadUInt64](./readuint64/)() | Giriş akışından 8 bayt okur ve bunları işaretsiz 64 bitlik bir tam sayı değeri olarak döndürür. |
| virtual [~BinaryReader](./~binaryreader/)() | Yıkıcı. |
## Ayrıca Bakınız

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
