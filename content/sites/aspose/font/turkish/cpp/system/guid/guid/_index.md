---
title: "System::Guid::Guid yapıcı"
linktitle: "Guid"
second_title: "Aspose.Font için C++"
description: "System::Guid::Guid yapıcı. C++'ta tüm sıfırlardan oluşan bir GUID'i temsil eden bir nesne oluşturur."
type: docs
weight: 100
url: /tr/cpp/system/guid/guid/
---
## Guid::Guid() constructor


Tüm sıfırlardan oluşan bir GUID'i temsil eden bir nesne oluşturur.

```cpp
System::Guid::Guid()
```

## Ayrıca Bakınız

* Class [Guid](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Guid::Guid(const ArrayPtr\<uint8_t\>\&) constructor


İmzasız 8-bit tamsayı değerleri dizisi olarak belirtilen bir GUID'i temsil eden bir nesne oluşturur.

```cpp
System::Guid::Guid(const ArrayPtr<uint8_t> &b)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| b | const ArrayPtr\<uint8_t\>\& | GUID'in ayrı baytlarını içeren bir bayt dizisi |

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Guid](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Guid::Guid(const Guid\&) constructor


Belirtilen nesneyle aynı GUID'i temsil eden bir nesne oluşturur.

```cpp
System::Guid::Guid(const Guid &guid)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| guid | const Guid\& | GUID değerinin kopyalanacağı [Guid](../) nesnesi |

## Ayrıca Bakınız

* Class [Guid](../)
* Class [Guid](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Guid::Guid(const String\&) constructor


Dize olarak belirtilen bir GUID'i temsil eden bir nesne oluşturur.

```cpp
System::Guid::Guid(const String &g)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| g | const String\& | Oluşturulan nesne tarafından temsil edilecek bir GUID'in dize temsili |

## Ayrıca Bakınız

* Class [String](../../string/)
* Class [Guid](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Guid::Guid(const System::Details::ArrayView\<uint8_t\>\&) constructor


İmzasız 8-bit tamsayı değerleri dizisi görünümü olarak belirtilen bir GUID'i temsil eden bir nesne oluşturur.

```cpp
System::Guid::Guid(const System::Details::ArrayView<uint8_t> &b)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| b | const System::Details::ArrayView\<uint8_t\>\& | GUID'in ayrı baytlarını içeren bir bayt dizisi |

## Ayrıca Bakınız

* Class [Guid](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Guid::Guid(int32_t, int16_t, int16_t, const ArrayPtr\<uint8_t\>\&) constructor


Belirtilen GUID bileşenlerinden [Guid](../) sınıfının bir örneğini oluşturur.

```cpp
System::Guid::Guid(int32_t a, int16_t b, int16_t c, const ArrayPtr<uint8_t> &d)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| a | int32_t | GUID'in 0-31 bitleri |
| b | int16_t | GUID'in 32-47 bitleri |
| c | int16_t | GUID'in 48-63 bitleri |
| d | const ArrayPtr\<uint8_t\>\& | GUID'in 64-127 bitlerini içeren bir bayt dizisi |

## Ayrıca Bakınız

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Guid](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Guid::Guid(int32_t, int16_t, int16_t, const System::Details::ArrayView\<uint8_t\>\&) constructor


Belirtilen GUID bileşenlerinden [Guid](../) sınıfının bir örneğini oluşturur.

```cpp
System::Guid::Guid(int32_t a, int16_t b, int16_t c, const System::Details::ArrayView<uint8_t> &d)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| a | int32_t | GUID'in 0-31 bitleri |
| b | int16_t | GUID'in 32-47 bitleri |
| c | int16_t | GUID'in 48-63 bitleri |
| d | const System::Details::ArrayView\<uint8_t\>\& | GUID'in 64-127 bitlerini içeren bir bayt dizisi görünümü |

## Ayrıca Bakınız

* Class [Guid](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Guid::Guid(int32_t, int16_t, int16_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t) constructor


Belirtilen işaretsiz tamsayılar ve baytlardan [Guid](../) sınıfının bir örneğini oluşturur.

```cpp
System::Guid::Guid(int32_t a, int16_t b, int16_t c, uint8_t d, uint8_t e, uint8_t f, uint8_t g, uint8_t h, uint8_t i, uint8_t j, uint8_t k)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| a | int32_t | GUID'in 0-31 bitleri |
| b | int16_t | GUID'in 32-47 bitleri |
| c | int16_t | GUID'in 48-63 bitleri |
| d | uint8_t | GUID'in 64-71 bitleri |
| e | uint8_t | GUID'in 72-79 bitleri |
| f | uint8_t | GUID'in 80-87 bitleri |
| g | uint8_t | GUID'in 88-95 bitleri |
| h | uint8_t | GUID'in 96-103 bitleri |
| i | uint8_t | GUID'in 104-111 bitleri |
| j | uint8_t | GUID'in 112-119 bitleri |
| k | uint8_t | GUID'in 120-127 bitleri |

## Ayrıca Bakınız

* Class [Guid](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Guid::Guid(uint32_t, uint16_t, uint16_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t) constructor


Belirtilen işaretsiz tamsayılar ve baytlardan [Guid](../) sınıfının bir örneğini oluşturur.

```cpp
System::Guid::Guid(uint32_t a, uint16_t b, uint16_t c, uint8_t d, uint8_t e, uint8_t f, uint8_t g, uint8_t h, uint8_t i, uint8_t j, uint8_t k)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| a | uint32_t | GUID'in 0-31 bitleri |
| b | uint16_t | GUID'in 32-47 bitleri |
| c | uint16_t | GUID'in 48-63 bitleri |
| d | uint8_t | GUID'in 64-71 bitleri |
| e | uint8_t | GUID'in 72-79 bitleri |
| f | uint8_t | GUID'in 80-87 bitleri |
| g | uint8_t | GUID'in 88-95 bitleri |
| h | uint8_t | GUID'in 96-103 bitleri |
| i | uint8_t | GUID'in 104-111 bitleri |
| j | uint8_t | GUID'in 112-119 bitleri |
| k | uint8_t | GUID'in 120-127 bitleri |

## Ayrıca Bakınız

* Class [Guid](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
