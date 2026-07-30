---
title: "System::IO::BinaryReader sınıfı"
linktitle: "BinaryReader"
second_title: "Aspose.Font için C++"
description: "System::IO::BinaryReader sınıfı. Belirli bir kodlamada ikili veri olarak ilkel veri tiplerini okuyan bir okuyucuyu temsil eder. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tipin örneği yığıt üzerinde veya new operatörüyle oluşturulmamalıdır, çünkü bu çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın. C++ içinde."
type: docs
weight: 800
url: /tr/cpp/system.io/binaryreader/
---
## BinaryReader class


Belirli bir kodlamada ikili veri olarak ilkel veri tiplerini okuyan bir okuyucuyu temsil eder. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığıt üzerinde veya new operatörüyle oluşturmayın, çünkü bu çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisiyle sarmalayın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

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
| virtual [Read](./read/)(ArrayPtr\<char_t\>, int, int) | Giriş akışından belirtilen sayıda karakteri okur, UTF-16 kodlamasına dönüştürür ve elde edilen UTF-16 karakterlerini belirtilen konumdan başlayarak belirtilen karakter dizisine yazar. |
| virtual [ReadBoolean](./readboolean/)() | Giriş akışından tek bir bayt okur ve onun boolean temsilini döndürür. |
| virtual [ReadByte](./readbyte/)() | Giriş akışından tek bir bayt okur. |
| virtual [ReadBytes](./readbytes/)(int) | Giriş akışından belirtilen sayıda baytı okur. |
| virtual [ReadChar](./readchar/)() | Giriş akışından tek bir karakter okur. |
| virtual [ReadChars](./readchars/)(int) | Giriş akışından belirtilen sayıda karakteri okur ve onları UTF-16 kodlamasında döndürür. |
| virtual [ReadDecimal](./readdecimal/)() | UYGULANMADI. |
| virtual [ReadDouble](./readdouble/)() | Giriş akışından 8 bayt okur ve bunları çift duyarlıklı kayan nokta değeri olarak döndürür. |
| virtual [ReadInt16](./readint16/)() | Giriş akışından 2 bayt okur ve bunları 16 bitlik tam sayı değeri olarak döndürür. |
| virtual [ReadInt32](./readint32/)() | Giriş akışından 4 bayt okur ve bunları 32 bitlik tam sayı değeri olarak döndürür. |
| virtual [ReadInt64](./readint64/)() | Giriş akışından 8 bayt okur ve bunları 64 bitlik tam sayı değeri olarak döndürür. |
| virtual [ReadSByte](./readsbyte/)() | Giriş akışından tek bir bayt okur ve onu işaretli 8 bitlik tam sayı değeri olarak döndürür. |
| virtual [ReadSingle](./readsingle/)() | Giriş akışından 4 bayt okur ve bunları tek duyarlıklı kayan nokta değeri olarak döndürür. |
| virtual [ReadString](./readstring/)() | Geçerli akıştan bir dize okur. Dize, uzunluğu ön ek olarak alır ve uzunluk, bir seferde yedi bitlik tamsayı olarak kodlanır. |
| virtual [ReadUInt16](./readuint16/)() | Giriş akışından 2 bayt okur ve bunları işaretsiz 16-bit tamsayı değeri olarak döndürür. |
| virtual [ReadUInt32](./readuint32/)() | Giriş akışından 4 bayt okur ve bunları işaretsiz 32-bit tamsayı değeri olarak döndürür. |
| virtual [ReadUInt64](./readuint64/)() | Giriş akışından 8 bayt okur ve bunları işaretsiz 64-bit tamsayı değeri olarak döndürür. |
| virtual [~BinaryReader](./~binaryreader/)() | Yıkıcı. |
## Ayrıca Bakınız

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
