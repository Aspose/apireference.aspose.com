---
title: "System::IO::BinaryWriter sınıfı"
linktitle: "BinaryWriter"
second_title: "Aspose.Font için C++"
description: "System::IO::BinaryWriter sınıfı. İlkel tip değerlerini bir bayt akışına yazan bir yazarı temsil eder. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığıt üzerinde veya new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 900
url: /tr/cpp/system.io/binarywriter/
---
## BinaryWriter class


İlkel tip değerlerini bir bayt akışına yazan bir yazarı temsil eder. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığıt üzerinde veya new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisiyle sarmalayın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class BinaryWriter : public System::IDisposable
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [BinaryWriter](./binarywriter/)(const StreamPtr\&, const EncodingPtr\&, bool) | Belirtilen kodlamayı kullanarak belirtilen akışa veri yazan [BinaryWriter](./) sınıfının bir örneğini oluşturur. |
| [Close](./close/)() | Mevcut [BinaryWriter](./) nesnesini ve altında yatan çıktı akışını kapatır. |
| [Dispose](./dispose/)() override | Geçerli nesne tarafından kullanılan tüm kaynakları serbest bırakır ve temel akışı kapatır. |
| [Flush](./flush/)() | Çıktı akışını temizler. |
| [get_BaseStream](./get_basestream/)() | Çıktı akışını döndürür. |
| [Seek](./seek/)(int, System::IO::SeekOrigin) | Geçerli nesne tarafından temsil edilen akışın konumunu ayarlar. |
| virtual [Write](./write/)(uint8_t) | Belirtilen işaretsiz 8-bit tamsayı değerini çıktı akışına yazar. |
| virtual [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int, int) | Belirtilen bayt dizisinden belirtilen bayt alt aralığını çıktı akışına yazar. |
| virtual [Write](./write/)(const ArrayPtr\<char_t\>\&, int, int) | Belirtilen karakter dizisinden belirtilen UTF-16 karakter alt aralığını çıktı akışına yazar. |
| virtual [Write](./write/)(bool) | Çıktı akışına **value** 'true' ise 0, **value** 'false' ise 1 değerinde tek bayt yazar. |
| virtual [Write](./write/)(char16_t) | Belirtilen 16 bit genişliğindeki karakter değerini çıktı akışına yazar. |
| virtual [Write](./write/)(int16_t) | Belirtilen 16 bit tamsayı değerini çıktı akışına yazar. |
| virtual [Write](./write/)(int) | Belirtilen 32 bit tamsayı değerini çıktı akışına yazar. |
| virtual [Write](./write/)(int64_t) | Belirtilen 64 bit tamsayı değerini çıktı akışına yazar. |
| virtual [Write](./write/)(uint16_t) | Belirtilen işaretsiz 16 bit tamsayı değerini çıktı akışına yazar. |
| virtual [Write](./write/)(uint32_t) | Belirtilen işaretsiz 32 bit tamsayı değerini çıktı akışına yazar. |
| virtual [Write](./write/)(uint64_t) | Belirtilen işaretsiz 64 bit tamsayı değerini çıktı akışına yazar. |
| virtual [Write](./write/)(float) | Belirtilen tek duyarlıklı kayan nokta değerini çıktı akışına yazar. |
| virtual [Write](./write/)(double) | Belirtilen çift duyarlıklı kayan nokta değerini çıktı akışına yazar. |
| virtual [Write](./write/)(const Decimal\&) | Belirtilen [Decimal](../../system/decimal/) değerinin bayt temsiliğini çıktı akışına yazar. |
| virtual [Write](./write/)(const String\&) | Geçerli kodlamada uzunluk ön ekli bir dizeyi çıktı akışına yazar. |
| virtual [Write](./write/)(const char_t *) | Geçerli kodlamada uzunluk ön ekli bir dizeyi çıktı akışına yazar. |
| [~BinaryWriter](./~binarywriter/)() | Yıkıcı. |
## Ayrıca Bakınız

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)
