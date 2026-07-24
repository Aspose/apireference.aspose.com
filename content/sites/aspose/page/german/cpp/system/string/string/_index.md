---
title: "System::String::String-Konstruktor"
linktitle: "String"
second_title: "Aspose.Page für C++"
description: "System::String::String-Konstruktor. Standardkonstruktor. Erstellt ein String-Objekt, das in C++ als null betrachtet wird."
type: docs
weight: 100
url: /de/cpp/system/string/string/
---
## String::String() constructor


Standardkonstruktor. Erstellt ein String-Objekt, das als null betrachtet wird.

```cpp
System::String::String()
```

## Siehe auch

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(codeporting_icu::UnicodeString\&&) constructor


Move-Konstruktor.

```cpp
System::String::String(codeporting_icu::UnicodeString &&str) noexcept
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| str | codeporting_icu::UnicodeString\&& | UnicodeString, um in [String](../) zu verpacken. |

## Siehe auch

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const ArrayPtr\<char16_t\>\&) constructor


Konvertiert das gesamte Zeichen-Array in einen String.

```cpp
System::String::String(const ArrayPtr<char16_t> &arr)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arr | const ArrayPtr\<char16_t\>\& | [Array](../../array/) zum Konvertieren in einen String. |

## Siehe auch

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const ArrayPtr\<char16_t\>\&, int, int) constructor


Konvertiert einen Teilbereich eines Zeichen-Arrays in einen String. Wenn die Parameter außerhalb der Array-Grenzen liegen, wird ein leerer String erstellt.

```cpp
System::String::String(const ArrayPtr<char16_t> &arr, int offset, int len)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arr | const ArrayPtr\<char16_t\>\& | Zeichenarray. |
| offset | int | Startindex des Teilarrays. |
| len | int | Länge des Teilarrays. |

## Siehe auch

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const char *, int) constructor


Konstruiert einen String aus einem Zeiger auf einen Zeichen-String und einer expliziten Länge.

```cpp
System::String::String(const char *str, int length)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| str | const char * | [String](../)-Zeiger auf die UTF8-Daten, kann ein Literal oder ein Array sein. |
| Länge | int | Explizite String-Länge |

## Siehe auch

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const char16_t *, int) constructor


Konstruiert einen String aus einem Zeiger auf einen Zeichen-String und einer expliziten Länge.

```cpp
System::String::String(const char16_t *str, int length)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| str | const char16_t * | [String](../) Zeiger, kann wörtlich oder ein Array sein. |
| Länge | int | Explizite String-Länge |

## Siehe auch

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const char16_t *, int, int) constructor


Konstruiert einen String aus einem Zeiger auf einen Zeichen-String, beginnend an einer Position, unter Verwendung einer Länge.

```cpp
System::String::String(const char16_t *str, int start, int length)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| str | const char16_t * | [String](../) Zeiger, kann wörtlich oder ein Array sein. |
| start | int | Startposition. |
| length | int | [String](../) Länge. |

## Siehe auch

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const char16_t, int) constructor


Füllkonstruktor.

```cpp
System::String::String(const char16_t ch, int count)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| ch | const char16_t | Füllzeichen. |
| count | int | Ziel-Länge. |

## Siehe auch

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const codeporting_icu::UnicodeString\&) constructor


Wickelt UnicodeString in [String](../) ein.

```cpp
System::String::String(const codeporting_icu::UnicodeString &str)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| str | const codeporting_icu::UnicodeString\& | UnicodeString, um in [String](../) zu verpacken. |

## Siehe auch

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const std::string\&) constructor


Erstellt [String](../) aus einem std::string, das im UTF-8-Format vorliegt.

```cpp
System::String::String(const std::string &utf8str)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| utf8str | const std::string\& | std::string, das in [String](../) konvertiert werden soll. |

## Siehe auch

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const std::u16string\&) constructor


Erstellt [String](../) aus einem utf16-String.

```cpp
System::String::String(const std::u16string &str)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| str | const std::u16string\& | Utf16-String, der in [String](../) konvertiert werden soll. |

## Siehe auch

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const std::u32string\&) constructor


Erstellt [String](../) aus einem std::u32string.

```cpp
System::String::String(const std::u32string &u32str)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| u32str | const std::u32string\& | std::u32string, das in [String](../) konvertiert werden soll. |

## Siehe auch

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const std::wstring\&) constructor


Erstellt [String](../) aus einem Wide-String.

```cpp
System::String::String(const std::wstring &str)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| str | const std::wstring\& | Wide-String, der in [String](../) konvertiert werden soll. |

## Siehe auch

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const String\&) constructor


Kopierkonstruktor.

```cpp
System::String::String(const String &str)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| str | const String\& | [String](../) zum Kopieren. |

## Siehe auch

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const T\&, typename std::enable_if\<IsStringPointer\<T, char\>::value\>::type *) constructor


Konstruiert einen String basierend auf einem Zeiger auf einen Zeichen-String. Behandelt den referenzierten String als nullterminiert in UTF‑8 und berechnet die Ziel-String-Länge anhand des Nullzeichens.

```cpp
template<typename T> System::String::String(const T &value, typename std::enable_if<IsStringPointer<T, char>::value>::type *=nullptr)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | const T\& | Zeiger auf Zeichenkette. |

## Siehe auch

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const T\&, typename std::enable_if\<IsStringPointer\<T, char16_t\>::value\>::type *) constructor


Konstruiert einen String basierend auf einem Zeiger auf einen Zeichen-String. Behandelt den referenzierten String als nullterminiert und berechnet die Ziel-String-Länge anhand des Nullzeichens.

```cpp
template<typename T> System::String::String(const T &value, typename std::enable_if<IsStringPointer<T, char16_t>::value>::type *=nullptr)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | const T\& | Zeiger auf Zeichenkette. |

## Siehe auch

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const T\&, typename std::enable_if\<IsStringPointer\<T, wchar_t\>::value\>::type *) constructor


Konstruiert einen String basierend auf einem Zeiger auf einen Wide-Character-String. Behandelt den referenzierten String als nullterminiert und berechnet die Ziel-String-Länge anhand des Nullzeichens. Die Konvertierung von wchar_t ist auf einigen Plattformen zeitaufwändig, daher sind implizite Konvertierungen nicht erlaubt.

```cpp
template<typename T> System::String::String(const T &value, typename std::enable_if<IsStringPointer<T, wchar_t>::value>::type *=nullptr)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | const T\& | Zeiger auf Zeichenkette. |

## Siehe auch

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const T\&, typename std::enable_if\<std::is_same\<T, std::nullptr_t\>::value\>::type *) constructor


Nullptr-Konstruktor. Als Template deklariert, um Prioritäten gegenüber anderen Template-Konstruktoren aufzulösen.

```cpp
template<typename T> System::String::String(const T &value, typename std::enable_if<std::is_same<T, std::nullptr_t>::value>::type *=nullptr)
```


| Parameter | Beschreibung |
| --- | --- |
| T | Sollte nullptr_t sein |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | const T\& | nullptr |

## Siehe auch

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const wchar_t *, int) constructor


Konstruiert einen String aus einem Zeiger auf einen Wide-Character-String und einer expliziten Länge. Die Konvertierung von wchar_t ist auf einigen Plattformen zeitaufwändig, daher sind implizite Konvertierungen nicht erlaubt.

```cpp
System::String::String(const wchar_t *str, int length)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| str | const wchar_t * | [String](../) Zeiger, kann wörtlich oder ein Array sein. |
| Länge | int | Explizite String-Länge |

## Siehe auch

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const wchar_t, int) constructor


Füllkonstruktor. Die Konvertierung von wchar_t ist auf einigen Plattformen zeitaufwändig, daher sind implizite Konvertierungen nicht erlaubt.

```cpp
System::String::String(const wchar_t ch, int count=1)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| ch | const wchar_t | Füllzeichen. |
| count | int | Ziel-Länge. |

## Siehe auch

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(String\&&) constructor


Move-Konstruktor.

```cpp
System::String::String(String &&str) noexcept
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| str | String\&& | [String](../) zum Verschieben von Daten aus. |

## Siehe auch

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(T\&, typename std::enable_if\<IsStringLiteral\<T, char\>::value\>::type *) constructor


Konstruiert einen String basierend auf einem String-Literal. Betrachtet das Literal als nullterminierten String in UTF‑8 und berechnet die Ziel-String-Länge anhand der Literalgröße.

```cpp
template<typename T> System::String::String(T &value, typename std::enable_if<IsStringLiteral<T, char>::value>::type *=nullptr)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | T\& | [String](../) Literalzeiger. |

## Siehe auch

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(T\&, typename std::enable_if\<IsStringLiteral\<T, char16_t\>::value\>::type *) constructor


Konstruiert einen String basierend auf einem String-Literal. Betrachtet das Literal als nullterminierten String und berechnet die Ziel-String-Länge anhand der Literalgröße.

```cpp
template<typename T> System::String::String(T &value, typename std::enable_if<IsStringLiteral<T, char16_t>::value>::type *=nullptr)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | T\& | [String](../) Literalzeiger. |

## Siehe auch

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(T\&, typename std::enable_if\<IsStringLiteral\<T, wchar_t\>::value\>::type *) constructor


Konstruiert einen String basierend auf einem Wide-String-Literal. Betrachtet das Literal als nullterminierten String und berechnet die Ziel-String-Länge anhand der Literalgröße. Die Konvertierung von wchar_t ist auf einigen Plattformen zeitaufwändig, daher sind implizite Konvertierungen nicht erlaubt.

```cpp
template<typename T> System::String::String(T &value, typename std::enable_if<IsStringLiteral<T, wchar_t>::value>::type *=nullptr)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | T\& | [String](../) Literalzeiger. |

## Siehe auch

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
