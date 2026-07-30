---
title: "Aspose::Font::TtfCommon::Version16Dot16 sınıfı"
linktitle: "Version16Dot16"
second_title: "Aspose.Font için C++"
description: "Aspose::Font::TtfCommon::Version16Dot16 sınıfı. C++'da Version16Dot16 veri tipini temsil eder."
type: docs
weight: 100
url: /tr/cpp/aspose.font.ttfcommon/version16dot16/
---
## Version16Dot16 class


[Version16Dot16](./) veri tipini temsil eder.

```cpp
class Version16Dot16 : public System::ICloneable
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Clone](./clone/)() override | [Version16Dot16](./) nesnesinin bir kopyasını oluştur. |
| [get_MajorNumber](./get_majornumber/)() const | Major sürüm numarasını alır. Değer yalnızca onaltılık gösterimde anlamlıdır, örneğin gerçek font dosyalarında 'maxp' için sürüm 0.5 4 bayttır: {0, 0, 80, 0}, bu da 0x00005000 onaltılık temsiline sahiptir. Bu sürüm font dosyasından okunduktan sonra, [Version16Dot16](./) nesnesi için Major ve minor numaralar sırasıyla 0 ve 20480 olacaktır. Ve bu değerler onaltılık biçimde 0x0000 ve 0x5000'dir. |
| [get_MinorNumber](./get_minornumber/)() const | Minor sürüm numarasını alır. Değer yalnızca onaltılık gösterimde anlamlıdır, örneğin gerçek font dosyalarında 'maxp' için sürüm 0.5 4 bayttır: {0, 0, 80, 0}, bu da 0x00005000 onaltılık temsiline sahiptir. Bu sürüm font dosyasından okunduktan sonra, [Version16Dot16](./) nesnesi için Major ve minor numaralar sırasıyla 0 ve 20480 olacaktır. Ve bu değerler onaltılık biçimde 0x0000 ve 0x5000'dir. |
| [get_RawBytes](./get_rawbytes/)() | [Version16Dot16](./) sürüm numarası için tüm ham bitleri, 4 bayt boyutunda bir bayt dizisi olarak alır. |
| [set_MajorNumber](./set_majornumber/)(uint16_t) | Major sürüm numarasını ayarlar. Değer yalnızca onaltılık gösterimde anlamlıdır, örneğin gerçek font dosyalarında 'maxp' için sürüm 0.5 4 bayttır: {0, 0, 80, 0}, bu da 0x00005000 onaltılık temsiline sahiptir. Bu sürüm font dosyasından okunduktan sonra, [Version16Dot16](./) nesnesi için Major ve minor numaralar sırasıyla 0 ve 20480 olacaktır. Ve bu değerler onaltılık biçimde 0x0000 ve 0x5000'dir. |
| [set_MinorNumber](./set_minornumber/)(uint16_t) | Minor sürüm numarasını ayarlar. Değer yalnızca onaltılık gösterimde anlamlıdır, örneğin gerçek font dosyalarında 'maxp' için sürüm 0.5 4 bayttır: {0, 0, 80, 0}, bu da 0x00005000 onaltılık temsiline sahiptir. Bu sürüm font dosyasından okunduktan sonra, [Version16Dot16](./) nesnesi için Major ve minor numaralar sırasıyla 0 ve 20480 olacaktır. Ve bu değerler onaltılık biçimde 0x0000 ve 0x5000'dir. |
| [ToString](./tostring/)() const override | Sürüm değerini biçimlendirilmiş bir dize olarak döndür. Örneğin "0.5", "1.1", "3.0" vb. |
| [Version16Dot16](./version16dot16/)() | Yapıcı. |
| [Version16Dot16](./version16dot16/)(uint16_t, uint16_t) | Yapıcı. |
## Ayrıca Bakınız

* Class [ICloneable](../../system/icloneable/)
* Namespace [Aspose::Font::TtfCommon](../)
* Library [Aspose.Font for C++](../../)
