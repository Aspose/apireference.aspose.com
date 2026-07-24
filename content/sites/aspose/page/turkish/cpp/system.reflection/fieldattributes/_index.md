---
title: "System::Reflection::FieldAttributes enum"
linktitle: "FieldAttributes"
second_title: "Aspose.Page için C++"
description: "System::Reflection::FieldAttributes enum. C++'da yansıtılan alan öznitelikleri."
type: docs
weight: 1200
url: /tr/cpp/system.reflection/fieldattributes/
---
## FieldAttributes enum


Yansıtılmış alan öznitelikleri.

```cpp
enum class FieldAttributes
```

### Değerler

| Ad | Değer | Açıklama |
| --- | --- | --- |
| FieldAccessMask | 7 | Üye erişim maskesi. Bu maskeyi erişilebilirlik bilgilerini almak için kullanın. |
| PrivateScope | 0 | Referans verilemeyen üyeler. |
| Private | 1 | Özel üyeler. |
| FamANDAssem | 2 | Özel ve derleme kapsamlı üyeler. |
| Assembly | 3 | Derleme kapsamlı üyeler. |
| Family | 4 | Tür ve alt türler tarafından erişilebilen üyeler. |
| FamORAssem | 5 | Tür, alt türler ve derleme tarafından erişilebilen üyeler. |
| Public | 6 | Herkes tarafından erişilebilen üyeler. |
| Static | 16 | Örnek üyelere karşıt olarak statik üyeler. |
| InitOnly | 32 | Sadece başlatılabilen ancak değiştirilemeyen sabit üyeler. |
| Literal | 64 | Derleme zamanında sabit üyeler. |
| NotSerialized | 128 | Serileştirilmeyen üyeler. |
| SpecialName | 512 | Aşağıdaki adlardan birinin özel alanı. |
| PinvokeImpl | 8192 | Interop yönlendirilmiş uygulama. |
| ReservedMask | 38144 | Yalnızca çalışma zamanı kullanımı için ayrılmış bayraklar. |
| RTSpecialName | 1024 | Çalışma zamanı ad kodlamasını kontrol etmelidir. |
| HasFieldMarshal | 4096 | Marshalling bilgisi mevcuttur. |
| HasDefault | 32768 | Varsayılan değer mevcuttur. |
| HasFieldRVA | 256 | RVA mevcuttur. |

## Ayrıca Bakınız

* Namespace [System::Reflection](../)
* Library [Aspose.Page for C++](../../)
