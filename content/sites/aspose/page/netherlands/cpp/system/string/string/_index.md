---
title: "System::String::String constructor"
linktitle: "String"
second_title: "Aspose.Page voor C++"
description: "System::String::String constructor. Standaardconstructor. Maakt een stringobject dat als null wordt beschouwd in C++."
type: docs
weight: 100
url: /nl/cpp/system/string/string/
---
## String::String() constructor


Standaardconstructor. Maakt een tekenreeksobject dat als null wordt beschouwd.

```cpp
System::String::String()
```

## Zie ook

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(codeporting_icu::UnicodeString\&&) constructor


Move-constructor.

```cpp
System::String::String(codeporting_icu::UnicodeString &&str) noexcept
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| str | codeporting_icu::UnicodeString\&& | UnicodeString om te verpakken in [String](../). |

## Zie ook

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const ArrayPtr\<char16_t\>\&) constructor


Converteert een volledige tekenarray naar een string.

```cpp
System::String::String(const ArrayPtr<char16_t> &arr)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| arr | const ArrayPtr\<char16_t\>\& | [Array](../../array/) om te converteren naar string. |

## Zie ook

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const ArrayPtr\<char16_t\>\&, int, int) constructor


Converteert een subbereik van een tekenarray naar een string. Als parameters buiten de arraygrenzen vallen, wordt een lege string geconstrueerd.

```cpp
System::String::String(const ArrayPtr<char16_t> &arr, int offset, int len)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| arr | const ArrayPtr\<char16_t\>\& | Tekenarray. |
| offset | int | Startindex van subarray. |
| len | int | Lengte van subarray. |

## Zie ook

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const char *, int) constructor


Construeert een tekenreeks vanuit een tekenreeks-pointer en een expliciete lengte.

```cpp
System::String::String(const char *str, int length)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| str | const char * | [String](../) pointer naar de UTF8-gegevens, kan letterlijk of een array zijn. |
| lengte | int | Expliciete stringlengte |

## Zie ook

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const char16_t *, int) constructor


Construeert een tekenreeks vanuit een tekenreeks-pointer en een expliciete lengte.

```cpp
System::String::String(const char16_t *str, int length)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| str | const char16_t * | [String](../) pointer, kan letterlijk of een array zijn. |
| lengte | int | Expliciete stringlengte |

## Zie ook

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const char16_t *, int, int) constructor


Construeert een tekenreeks vanuit een tekenreeks-pointer vanaf de startpositie met behulp van een lengte.

```cpp
System::String::String(const char16_t *str, int start, int length)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| str | const char16_t * | [String](../) pointer, kan letterlijk of een array zijn. |
| start | int | Startpositie. |
| length | int | [String](../) lengte. |

## Zie ook

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const char16_t, int) constructor


Vulconstructor.

```cpp
System::String::String(const char16_t ch, int count)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| ch | const char16_t | Vulkarakter. |
| count | int | Doellengte. |

## Zie ook

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const codeporting_icu::UnicodeString\&) constructor


Verpakt UnicodeString in [String](../).

```cpp
System::String::String(const codeporting_icu::UnicodeString &str)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| str | const codeporting_icu::UnicodeString\& | UnicodeString om te verpakken in [String](../). |

## Zie ook

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const std::string\&) constructor


Maakt [String](../) van een std::string die wordt gepresenteerd in UTF-8-indeling.

```cpp
System::String::String(const std::string &utf8str)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| utf8str | const std::string\& | std::string om te converteren naar [String](../). |

## Zie ook

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const std::u16string\&) constructor


Maakt [String](../) van een utf16-string.

```cpp
System::String::String(const std::u16string &str)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| str | const std::u16string\& | Utf16-string om te converteren naar [String](../). |

## Zie ook

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const std::u32string\&) constructor


Maakt [String](../) van een std::u32string.

```cpp
System::String::String(const std::u32string &u32str)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| u32str | const std::u32string\& | std::u32string tekenreeks om te converteren naar [String](../). |

## Zie ook

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const std::wstring\&) constructor


Maakt [String](../) van widestring.

```cpp
System::String::String(const std::wstring &str)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| str | const std::wstring\& | Widestring om te converteren naar [String](../). |

## Zie ook

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const String\&) constructor


Copy-constructor.

```cpp
System::String::String(const String &str)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| str | const String\& | [String](../) om te kopiëren. |

## Zie ook

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const T\&, typename std::enable_if\<IsStringPointer\<T, char\>::value\>::type *) constructor


Construeert een tekenreeks op basis van een tekenreeks-pointer. Beschouwt de aangewezen tekenreeks als null-terminerend in UTF8 en berekent de doeltekenreekslengte op basis van het null-teken.

```cpp
template<typename T> System::String::String(const T &value, typename std::enable_if<IsStringPointer<T, char>::value>::type *=nullptr)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| value | const T\& | Pointer naar tekenreeks. |

## Zie ook

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const T\&, typename std::enable_if\<IsStringPointer\<T, char16_t\>::value\>::type *) constructor


Construeert een tekenreeks op basis van een tekenreeks-pointer. Beschouwt de aangewezen tekenreeks als null-terminerend en berekent de doeltekenreekslengte op basis van het null-teken.

```cpp
template<typename T> System::String::String(const T &value, typename std::enable_if<IsStringPointer<T, char16_t>::value>::type *=nullptr)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| value | const T\& | Pointer naar tekenreeks. |

## Zie ook

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const T\&, typename std::enable_if\<IsStringPointer\<T, wchar_t\>::value\>::type *) constructor


Construeert een tekenreeks op basis van een widecharacter-pointer. Beschouwt de aangewezen tekenreeks als null-terminerend en berekent de doeltekenreekslengte op basis van het null-teken. Conversie van wchar_t is tijdrovend op sommige platforms, dus impliciete conversies zijn niet toegestaan.

```cpp
template<typename T> System::String::String(const T &value, typename std::enable_if<IsStringPointer<T, wchar_t>::value>::type *=nullptr)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| value | const T\& | Pointer naar tekenreeks. |

## Zie ook

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const T\&, typename std::enable_if\<std::is_same\<T, std::nullptr_t\>::value\>::type *) constructor


Nullptr-constructor. Gedefinieerd als sjabloon om prioriteiten met andere sjabloonconstructors op te lossen.

```cpp
template<typename T> System::String::String(const T &value, typename std::enable_if<std::is_same<T, std::nullptr_t>::value>::type *=nullptr)
```


| Parameter | Beschrijving |
| --- | --- |
| T | Moet nullptr_t zijn |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| value | const T\& | nullptr |

## Zie ook

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const wchar_t *, int) constructor


Construeert een tekenreeks vanuit een widecharacter-pointer en een expliciete lengte. Conversie van wchar_t is tijdrovend op sommige platforms, dus impliciete conversies zijn niet toegestaan.

```cpp
System::String::String(const wchar_t *str, int length)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| str | const wchar_t * | [String](../) pointer, kan letterlijk of een array zijn. |
| lengte | int | Expliciete stringlengte |

## Zie ook

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const wchar_t, int) constructor


Vulconstructor. Conversie van wchar_t is tijdrovend op sommige platforms, dus impliciete conversies zijn niet toegestaan.

```cpp
System::String::String(const wchar_t ch, int count=1)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| ch | const wchar_t | Vulkarakter. |
| count | int | Doellengte. |

## Zie ook

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(String\&&) constructor


Move-constructor.

```cpp
System::String::String(String &&str) noexcept
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| str | String\&& | [String](../) om gegevens van te verplaatsen. |

## Zie ook

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(T\&, typename std::enable_if\<IsStringLiteral\<T, char\>::value\>::type *) constructor


Construeert een tekenreeks op basis van een tekenreeksliteral. Beschouwt de literal als een null-terminerende tekenreeks in UTF8 en berekent de doeltekenreekslengte op basis van de grootte van de literal.

```cpp
template<typename T> System::String::String(T &value, typename std::enable_if<IsStringLiteral<T, char>::value>::type *=nullptr)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| value | T\& | [String](../) literal-pointer. |

## Zie ook

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(T\&, typename std::enable_if\<IsStringLiteral\<T, char16_t\>::value\>::type *) constructor


Construeert een tekenreeks op basis van een tekenreeksliteral. Beschouwt de literal als een null-terminerende tekenreeks en berekent de doeltekenreekslengte op basis van de grootte van de literal.

```cpp
template<typename T> System::String::String(T &value, typename std::enable_if<IsStringLiteral<T, char16_t>::value>::type *=nullptr)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| value | T\& | [String](../) literal-pointer. |

## Zie ook

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(T\&, typename std::enable_if\<IsStringLiteral\<T, wchar_t\>::value\>::type *) constructor


Construeert een tekenreeks op basis van een widestring-literal. Beschouwt de literal als een null-terminerende tekenreeks en berekent de doeltekenreekslengte op basis van de grootte van de literal. Conversie van wchar_t is tijdrovend op sommige platforms, dus impliciete conversies zijn niet toegestaan.

```cpp
template<typename T> System::String::String(T &value, typename std::enable_if<IsStringLiteral<T, wchar_t>::value>::type *=nullptr)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| value | T\& | [String](../) literal-pointer. |

## Zie ook

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
