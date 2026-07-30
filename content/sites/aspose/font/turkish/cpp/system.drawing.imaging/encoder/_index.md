---
title: "System::Drawing::Imaging::Encoder class"
linktitle: "Encoder"
second_title: "Aspose.Font için C++"
description: "System::Drawing::Imaging::Encoder sınıfı. Görüntü kodlayıcı parametreleri kümesiyle ilişkili bir GUID'i temsil eder. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak allocate (ayrılmalıdır). Bu tipin bir örneğini yığına (stack) veya new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 500
url: /tr/cpp/system.drawing.imaging/encoder/
---
## Encoder class


Bir görüntü kodlayıcı parametreleri kümesiyle ilişkili bir GUID'i temsil eder. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak allocate (ayrılmalıdır). Bu tipin bir örneğini yığına (stack) veya new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisiyle sarmalayın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class Encoder : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Encoder](./encoder/)(const Guid\&) | Yeni bir [Encoder](./) sınıfı örneği oluşturur. |
| [get_Guid](./get_guid/)() const | Geçerli nesnenin temsil ettiği bir görüntü kodlayıcı parametreleri kümesini belirten bir GUID döndürür. |
## Alanlar

| Alan | Açıklama |
| --- | --- |
| static [ChrominanceTable](./chrominancetable/) | Krominans tablosu parametre kategorisini temsil eden [Encoder](./) sınıfının bir örneği. |
| static [ColorDepth](./colordepth/) | Renk derinliği parametre kategorisini temsil eden [Encoder](./) sınıfının bir örneği. |
| static [Compression](./compression/) | Sıkıştırma parametre kategorisini temsil eden [Encoder](./) sınıfının bir örneği. |
| static [LuminanceTable](./luminancetable/) | Luminans tablosu parametre kategorisini temsil eden [Encoder](./) sınıfının bir örneği. |
| static [Quality](./quality/) | Kalite parametre kategorisini temsil eden [Encoder](./) sınıfının bir örneği. |
| static [RenderMethod](./rendermethod/) | Render yöntemi parametre kategorisini temsil eden [Encoder](./) sınıfının bir örneği. |
| static [SaveFlag](./saveflag/) | Kaydetme bayrağı parametre kategorisini temsil eden [Encoder](./) sınıfının bir örneği. |
| static [ScanMethod](./scanmethod/) | Tarama yöntemi parametre kategorisini temsil eden [Encoder](./) sınıfının bir örneği. |
| static [Transformation](./transformation/) | Dönüşüm parametre kategorisini temsil eden [Encoder](./) sınıfının bir örneği. |
| static [Version](./version/) | Versiyon parametre kategorisini temsil eden [Encoder](./) sınıfının bir örneği. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Font for C++](../../)
