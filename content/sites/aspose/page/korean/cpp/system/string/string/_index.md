---
title: "System::String::String 생성자"
linktitle: "String"
second_title: "C++용 Aspose.Page"
description: "System::String::String 생성자. 기본 생성자. C++에서 null로 간주되는 문자열 객체를 생성합니다."
type: docs
weight: 100
url: /ko/cpp/system/string/string/
---
## String::String() constructor


기본 생성자. null로 간주되는 문자열 객체를 생성합니다.

```cpp
System::String::String()
```

## 또 보기

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(codeporting_icu::UnicodeString\&&) constructor


이동 생성자.

```cpp
System::String::String(codeporting_icu::UnicodeString &&str) noexcept
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| str | codeporting_icu::UnicodeString\&& | UnicodeString를 [String](../)으로 래핑합니다. |

## 또 보기

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const ArrayPtr\<char16_t\>\&) constructor


전체 문자 배열을 문자열로 변환합니다.

```cpp
System::String::String(const ArrayPtr<char16_t> &arr)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| arr | const ArrayPtr\<char16_t\>\& | [Array](../../array/)를 문자열로 변환합니다. |

## 또 보기

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const ArrayPtr\<char16_t\>\&, int, int) constructor


문자 배열의 부분 범위를 문자열로 변환합니다. 매개변수가 배열 범위를 벗어나면 빈 문자열이 생성됩니다.

```cpp
System::String::String(const ArrayPtr<char16_t> &arr, int offset, int len)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| arr | const ArrayPtr\<char16_t\>\& | 문자 배열. |
| offset | int | 하위 배열 시작 인덱스. |
| len | int | 하위 배열 길이. |

## 또 보기

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const char *, int) constructor


문자열 포인터와 명시적 길이를 사용하여 문자열을 생성합니다.

```cpp
System::String::String(const char *str, int length)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| str | const char * | [String](../) 포인터는 UTF8 데이터이며, 리터럴이거나 배열일 수 있습니다. |
| 길이 | int | 명시적 문자열 길이 |

## 또 보기

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const char16_t *, int) constructor


문자열 포인터와 명시적 길이를 사용하여 문자열을 생성합니다.

```cpp
System::String::String(const char16_t *str, int length)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| str | const char16_t * | [String](../) 포인터, 리터럴이거나 배열일 수 있습니다. |
| 길이 | int | 명시적 문자열 길이 |

## 또 보기

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const char16_t *, int, int) constructor


시작 위치와 길이를 사용하여 문자열 포인터에서 문자열을 생성합니다.

```cpp
System::String::String(const char16_t *str, int start, int length)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| str | const char16_t * | [String](../) 포인터, 리터럴이거나 배열일 수 있습니다. |
| 시작 | int | 시작 위치. |
| length | int | [String](../) 길이. |

## 또 보기

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const char16_t, int) constructor


채우기 생성자.

```cpp
System::String::String(const char16_t ch, int count)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| ch | const char16_t | 채우기 문자. |
| count | int | 목표 길이. |

## 또 보기

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const codeporting_icu::UnicodeString\&) constructor


UnicodeString를 [String](../)으로 래핑합니다.

```cpp
System::String::String(const codeporting_icu::UnicodeString &str)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| str | const codeporting_icu::UnicodeString\& | UnicodeString를 [String](../)으로 래핑합니다. |

## 또 보기

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const std::string\&) constructor


UTF-8 형식으로 제공된 std::string 문자열에서 [String](../)을 생성합니다.

```cpp
System::String::String(const std::string &utf8str)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| utf8str | const std::string\& | std::string 문자열을 [String](../)으로 변환합니다. |

## 또 보기

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const std::u16string\&) constructor


utf16 문자열에서 [String](../)을 생성합니다.

```cpp
System::String::String(const std::u16string &str)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| str | const std::u16string\& | Utf16 문자열을 [String](../)으로 변환합니다. |

## 또 보기

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const std::u32string\&) constructor


std::u32string 문자열에서 [String](../)을 생성합니다.

```cpp
System::String::String(const std::u32string &u32str)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| u32str | const std::u32string\& | std::u32string 문자열을 [String](../)으로 변환합니다. |

## 또 보기

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const std::wstring\&) constructor


와이드 문자열에서 [String](../)을 생성합니다.

```cpp
System::String::String(const std::wstring &str)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| str | const std::wstring\& | 와이드 문자열을 [String](../)으로 변환합니다. |

## 또 보기

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const String\&) constructor


복사 생성자.

```cpp
System::String::String(const String &str)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| str | const String\& | [String](../) 복사용. |

## 또 보기

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const T\&, typename std::enable_if\<IsStringPointer\<T, char\>::value\>::type *) constructor


문자열 포인터를 기반으로 문자열을 생성합니다. 가리키는 문자열을 UTF8의 null 종료 문자열로 처리하고, null 문자 기준으로 대상 문자열 길이를 계산합니다.

```cpp
template<typename T> System::String::String(const T &value, typename std::enable_if<IsStringPointer<T, char>::value>::type *=nullptr)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | const T\& | 문자열 포인터. |

## 또 보기

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const T\&, typename std::enable_if\<IsStringPointer\<T, char16_t\>::value\>::type *) constructor


문자열 포인터를 기반으로 문자열을 생성합니다. 가리키는 문자열을 null 종료 문자열로 처리하고, null 문자 기준으로 대상 문자열 길이를 계산합니다.

```cpp
template<typename T> System::String::String(const T &value, typename std::enable_if<IsStringPointer<T, char16_t>::value>::type *=nullptr)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | const T\& | 문자열 포인터. |

## 또 보기

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const T\&, typename std::enable_if\<IsStringPointer\<T, wchar_t\>::value\>::type *) constructor


와이드 문자 문자열 포인터를 기반으로 문자열을 생성합니다. 가리키는 문자열을 null 종료 문자열로 처리하고, null 문자 기준으로 대상 문자열 길이를 계산합니다. 일부 플랫폼에서는 wchar_t 변환이 시간이 많이 소요되므로 암시적 변환이 허용되지 않습니다.

```cpp
template<typename T> System::String::String(const T &value, typename std::enable_if<IsStringPointer<T, wchar_t>::value>::type *=nullptr)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | const T\& | 문자열 포인터. |

## 또 보기

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const T\&, typename std::enable_if\<std::is_same\<T, std::nullptr_t\>::value\>::type *) constructor


nullptr 생성자. 다른 템플릿 생성자와의 우선순위를 해결하기 위해 템플릿으로 선언되었습니다.

```cpp
template<typename T> System::String::String(const T &value, typename std::enable_if<std::is_same<T, std::nullptr_t>::value>::type *=nullptr)
```


| 매개변수 | 설명 |
| --- | --- |
| T | nullptr_t이어야 합니다 |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | const T\& | nullptr |

## 또 보기

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const wchar_t *, int) constructor


와이드 문자 문자열 포인터와 명시적 길이를 사용하여 문자열을 생성합니다. 일부 플랫폼에서는 wchar_t 변환이 시간이 많이 소요되므로 암시적 변환이 허용되지 않습니다.

```cpp
System::String::String(const wchar_t *str, int length)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| str | const wchar_t * | [String](../) 포인터, 리터럴이거나 배열일 수 있습니다. |
| 길이 | int | 명시적 문자열 길이 |

## 또 보기

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(const wchar_t, int) constructor


채우기 생성자. 일부 플랫폼에서는 wchar_t 변환이 시간이 많이 소요되므로 암시적 변환이 허용되지 않습니다.

```cpp
System::String::String(const wchar_t ch, int count=1)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| ch | const wchar_t | 채우기 문자. |
| count | int | 목표 길이. |

## 또 보기

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(String\&&) constructor


이동 생성자.

```cpp
System::String::String(String &&str) noexcept
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| str | String\&& | [String](../)에서 데이터를 이동하기 위해. |

## 또 보기

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(T\&, typename std::enable_if\<IsStringLiteral\<T, char\>::value\>::type *) constructor


문자열 리터럴을 기반으로 문자열을 생성합니다. 리터럴을 UTF8의 null 종료 문자열로 간주하고, 리터럴 크기를 기준으로 대상 문자열 길이를 계산합니다.

```cpp
template<typename T> System::String::String(T &value, typename std::enable_if<IsStringLiteral<T, char>::value>::type *=nullptr)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | T\& | [String](../) 리터럴 포인터. |

## 또 보기

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(T\&, typename std::enable_if\<IsStringLiteral\<T, char16_t\>::value\>::type *) constructor


문자열 리터럴을 기반으로 문자열을 생성합니다. 리터럴을 null 종료 문자열로 간주하고, 리터럴 크기를 기준으로 대상 문자열 길이를 계산합니다.

```cpp
template<typename T> System::String::String(T &value, typename std::enable_if<IsStringLiteral<T, char16_t>::value>::type *=nullptr)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | T\& | [String](../) 리터럴 포인터. |

## 또 보기

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::String(T\&, typename std::enable_if\<IsStringLiteral\<T, wchar_t\>::value\>::type *) constructor


와이드 문자열 리터럴을 기반으로 문자열을 생성합니다. 리터럴을 null 종료 문자열로 간주하고, 리터럴 크기를 기준으로 대상 문자열 길이를 계산합니다. 일부 플랫폼에서는 wchar_t 변환이 시간이 많이 소요되므로 암시적 변환이 허용되지 않습니다.

```cpp
template<typename T> System::String::String(T &value, typename std::enable_if<IsStringLiteral<T, wchar_t>::value>::type *=nullptr)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | T\& | [String](../) 리터럴 포인터. |

## 또 보기

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
