---
title: "System::operator<< 메서드"
linktitle: "operator<<"
second_title: "C++용 Aspose.Page"
description: "System::operator<< 메서드. C++에서 UTF-8 인코딩을 사용하여 문자열을 출력 스트림에 출력합니다."
type: docs
weight: 29100
url: /ko/cpp/system/operator__/
---
## System::operator<<(std::ostream\&, const String\&) method


UTF-8 인코딩을 사용하여 문자열을 출력 스트림에 출력합니다.

```cpp
std::ostream & System::operator<<(std::ostream &os, const String &str)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| os | std::ostream\& | 출력 스트림 객체 (**basic_ostream**를 **char**와 함께 인스턴스화한). |
| str | const String\& | 출력 스트림으로 전송될 문자열. |

### ReturnValue

문자열이 추가된 출력 스트림.

## 또 보기

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator<<(std::ostream\&, const Decimal\&) method


UTF-8 인코딩을 사용하여 스트림에 데이터를 삽입합니다.

```cpp
std::ostream & System::operator<<(std::ostream &stream, const Decimal &decimal)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 스트림 | std::ostream\& | 데이터를 삽입할 출력 스트림입니다. |
| decimal | const Decimal\& | 삽입할 [Data](../../system.data/) |

### ReturnValue

**stream**.

## 또 보기

* Class [Decimal](../decimal/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator<<(std::ostream\&, const Exception\&) method


UTF-8 인코딩을 사용하여 스트림에 데이터를 삽입합니다.

```cpp
std::ostream & System::operator<<(std::ostream &stream, const Exception &exception)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 스트림 | std::ostream\& | 데이터를 삽입할 출력 스트림입니다. |
| exception | const Exception\& | 삽입할 [Data](../../system.data/) |

### ReturnValue

**stream**.

## 또 보기

* Typedef [Exception](../exception/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator<<(std::ostream\&, const Guid\&) method


UTF-8 인코딩을 사용하여 스트림에 데이터를 삽입합니다.

```cpp
std::ostream & System::operator<<(std::ostream &stream, const Guid &guid)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 스트림 | std::ostream\& | 데이터를 삽입할 출력 스트림입니다. |
| guid | const Guid\& | 삽입할 [Data](../../system.data/) |

### ReturnValue

**stream**.

## 또 보기

* Class [Guid](../guid/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator<<(std::ostream\&, const Nullable\<T\>\&) method


UTF-8 인코딩을 사용하여 스트림에 데이터를 삽입합니다.

```cpp
template<typename T> std::ostream & System::operator<<(std::ostream &stream, const Nullable<T> &value)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 스트림 | std::ostream\& | 데이터를 삽입할 출력 스트림입니다. |
| value | const Nullable\<T\>\& | 삽입할 [Data](../../system.data/) |

### ReturnValue

**stream**.

## 또 보기

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator<<(std::ostream\&, const OperatingSystem\&) method


UTF-8 인코딩을 사용하여 스트림에 데이터를 삽입합니다.

```cpp
std::ostream & System::operator<<(std::ostream &stream, const OperatingSystem &os)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 스트림 | std::ostream\& | 데이터를 삽입할 출력 스트림입니다. |
| os | const OperatingSystem\& | 삽입할 [Data](../../system.data/) |

### ReturnValue

**stream**.

## 또 보기

* Class [OperatingSystem](../operatingsystem/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator<<(std::ostream\&, const SharedPtr\<T\>\&) method


UTF-8 인코딩을 사용하여 스트림에 데이터를 삽입합니다.

```cpp
template<typename T> std::ostream & System::operator<<(std::ostream &stream, const SharedPtr<T> &object_ptr)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 스트림 | std::ostream\& | 데이터를 삽입할 출력 스트림입니다. |
| object_ptr | const SharedPtr\<T\>\& | 삽입할 [Data](../../system.data/) |

### ReturnValue

**stream**.

## 또 보기

* Typedef [SharedPtr](../sharedptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator<<(std::ostream\&, const System::Object\&) method


UTF-8 인코딩을 사용하여 스트림에 데이터를 삽입합니다.

```cpp
std::ostream & System::operator<<(std::ostream &stream, const System::Object &object)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 스트림 | std::ostream\& | 데이터를 삽입할 출력 스트림입니다. |
| object | const System::Object\& | 삽입할 [Data](../../system.data/) |

### ReturnValue

**stream**.

## 또 보기

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator<<(std::ostream\&, const TypeInfo\&) method


UTF-8 인코딩을 사용하여 스트림에 데이터를 삽입합니다.

```cpp
std::ostream & System::operator<<(std::ostream &stream, const TypeInfo &type_info)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 스트림 | std::ostream\& | 데이터를 삽입할 출력 스트림입니다. |
| type_info | const TypeInfo\& | 삽입할 [Data](../../system.data/) |

### ReturnValue

**stream**.

## 또 보기

* Class [TypeInfo](../typeinfo/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator<<(std::ostream\&, const Version\&) method


UTF-8 인코딩을 사용하여 스트림에 데이터를 삽입합니다.

```cpp
std::ostream & System::operator<<(std::ostream &stream, const Version &version)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 스트림 | std::ostream\& | 데이터를 삽입할 출력 스트림입니다. |
| version | const Version\& | 삽입할 [Data](../../system.data/) |

### ReturnValue

**stream**.

## 또 보기

* Class [Version](../version/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator<<(std::ostream\&, const WeakPtr\<T\>\&) method


UTF-8 인코딩을 사용하여 스트림에 데이터를 삽입합니다.

```cpp
template<typename T> std::ostream & System::operator<<(std::ostream &stream, const WeakPtr<T> &object_ptr)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 스트림 | std::ostream\& | 데이터를 삽입할 출력 스트림입니다. |
| object_ptr | const WeakPtr\<T\>\& | 삽입할 [Data](../../system.data/) |

### ReturnValue

**stream**.

## 또 보기

* Class [WeakPtr](../weakptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator<<(std::ostream\&, DateTime) method


UTF-8 인코딩을 사용하여 스트림에 데이터를 삽입합니다.

```cpp
std::ostream & System::operator<<(std::ostream &stream, DateTime date_time)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 스트림 | std::ostream\& | 데이터를 삽입할 출력 스트림입니다. |
| date_time | DateTime | 삽입할 [Data](../../system.data/) |

### ReturnValue

**stream**.

## 또 보기

* Class [DateTime](../datetime/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator<<(std::ostream\&, DateTimeOffset) method


UTF-8 인코딩을 사용하여 스트림에 데이터를 삽입합니다.

```cpp
std::ostream & System::operator<<(std::ostream &stream, DateTimeOffset value)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 스트림 | std::ostream\& | 데이터를 삽입할 출력 스트림입니다. |
| value | DateTimeOffset | 삽입할 [Data](../../system.data/) |

### ReturnValue

**stream**.

## 또 보기

* Class [DateTimeOffset](../datetimeoffset/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator<<(std::ostream\&, TimeSpan) method


UTF-8 인코딩을 사용하여 스트림에 데이터를 삽입합니다.

```cpp
std::ostream & System::operator<<(std::ostream &stream, TimeSpan time_span)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 스트림 | std::ostream\& | 데이터를 삽입할 출력 스트림입니다. |
| time_span | TimeSpan | 삽입할 [Data](../../system.data/) |

### ReturnValue

**stream**.

## 또 보기

* Class [TimeSpan](../timespan/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator<<(std::wostream\&, const String\&) method


문자열을 출력 스트림에 출력합니다.

```cpp
std::wostream & System::operator<<(std::wostream &os, const String &str)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| os | std::wostream\& | 출력 스트림 객체 (**basic_ostream**를 **wchar_t**와 함께 인스턴스화한). |
| str | const String\& | 출력 스트림으로 전송될 문자열. |

### ReturnValue

문자열이 추가된 출력 스트림.

## 또 보기

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator<<(std::wostream\&, const Decimal\&) method


스트림에 데이터를 삽입합니다.

```cpp
std::wostream & System::operator<<(std::wostream &stream, const Decimal &decimal)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 스트림 | std::wostream\& | 데이터를 삽입할 출력 스트림입니다. |
| decimal | const Decimal\& | 삽입할 [Data](../../system.data/) |

### ReturnValue

**stream**.

## 또 보기

* Class [Decimal](../decimal/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator<<(std::wostream\&, const Exception\&) method


스트림에 데이터를 삽입합니다.

```cpp
std::wostream & System::operator<<(std::wostream &stream, const Exception &exception)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 스트림 | std::wostream\& | 데이터를 삽입할 출력 스트림입니다. |
| exception | const Exception\& | 삽입할 [Data](../../system.data/) |

### ReturnValue

**stream**.

## 또 보기

* Typedef [Exception](../exception/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator<<(std::wostream\&, const Guid\&) method


스트림에 데이터를 삽입합니다.

```cpp
std::wostream & System::operator<<(std::wostream &stream, const Guid &guid)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 스트림 | std::wostream\& | 데이터를 삽입할 출력 스트림입니다. |
| guid | const Guid\& | 삽입할 [Data](../../system.data/) |

### ReturnValue

**stream**.

## 또 보기

* Class [Guid](../guid/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator<<(std::wostream\&, const Nullable\<T\>\&) method


스트림에 데이터를 삽입합니다.

```cpp
template<typename T> std::wostream & System::operator<<(std::wostream &stream, const Nullable<T> &value)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 스트림 | std::wostream\& | 데이터를 삽입할 출력 스트림입니다. |
| value | const Nullable\<T\>\& | 삽입할 [Data](../../system.data/) |

### ReturnValue

**stream**.

## 또 보기

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator<<(std::wostream\&, const OperatingSystem\&) method


스트림에 데이터를 삽입합니다.

```cpp
std::wostream & System::operator<<(std::wostream &stream, const OperatingSystem &os)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 스트림 | std::wostream\& | 데이터를 삽입할 출력 스트림입니다. |
| os | const OperatingSystem\& | 삽입할 [Data](../../system.data/) |

### ReturnValue

**stream**.

## 또 보기

* Class [OperatingSystem](../operatingsystem/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator<<(std::wostream\&, const SharedPtr\<T\>\&) method


스트림에 데이터를 삽입합니다.

```cpp
template<typename T> std::wostream & System::operator<<(std::wostream &stream, const SharedPtr<T> &object_ptr)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 스트림 | std::wostream\& | 데이터를 삽입할 출력 스트림입니다. |
| object_ptr | const SharedPtr\<T\>\& | 삽입할 [Data](../../system.data/) |

### ReturnValue

**stream**.

## 또 보기

* Typedef [SharedPtr](../sharedptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator<<(std::wostream\&, const System::Object\&) method


스트림에 데이터를 삽입합니다.

```cpp
std::wostream & System::operator<<(std::wostream &stream, const System::Object &object)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 스트림 | std::wostream\& | 데이터를 삽입할 출력 스트림입니다. |
| object | const System::Object\& | 삽입할 [Data](../../system.data/) |

### ReturnValue

**stream**.

## 또 보기

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator<<(std::wostream\&, const TypeInfo\&) method


스트림에 데이터를 삽입합니다.

```cpp
std::wostream & System::operator<<(std::wostream &stream, const TypeInfo &type_info)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 스트림 | std::wostream\& | 데이터를 삽입할 출력 스트림입니다. |
| type_info | const TypeInfo\& | 삽입할 [Data](../../system.data/) |

### ReturnValue

**stream**.

## 또 보기

* Class [TypeInfo](../typeinfo/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator<<(std::wostream\&, const Version\&) method


스트림에 데이터를 삽입합니다.

```cpp
std::wostream & System::operator<<(std::wostream &stream, const Version &version)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 스트림 | std::wostream\& | 데이터를 삽입할 출력 스트림입니다. |
| version | const Version\& | 삽입할 [Data](../../system.data/) |

### ReturnValue

**stream**.

## 또 보기

* Class [Version](../version/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator<<(std::wostream\&, const WeakPtr\<T\>\&) method


스트림에 데이터를 삽입합니다.

```cpp
template<typename T> std::wostream & System::operator<<(std::wostream &stream, const WeakPtr<T> &object_ptr)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 스트림 | std::wostream\& | 데이터를 삽입할 출력 스트림입니다. |
| object_ptr | const WeakPtr\<T\>\& | 삽입할 [Data](../../system.data/) |

### ReturnValue

**stream**.

## 또 보기

* Class [WeakPtr](../weakptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator<<(std::wostream\&, DateTime) method


스트림에 데이터를 삽입합니다.

```cpp
std::wostream & System::operator<<(std::wostream &stream, DateTime date_time)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 스트림 | std::wostream\& | 데이터를 삽입할 출력 스트림입니다. |
| date_time | DateTime | 삽입할 [Data](../../system.data/) |

### ReturnValue

**stream**.

## 또 보기

* Class [DateTime](../datetime/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator<<(std::wostream\&, DateTimeOffset) method


스트림에 데이터를 삽입합니다.

```cpp
std::wostream & System::operator<<(std::wostream &stream, DateTimeOffset value)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 스트림 | std::wostream\& | 데이터를 삽입할 출력 스트림입니다. |
| value | DateTimeOffset | 삽입할 [Data](../../system.data/) |

### ReturnValue

**stream**.

## 또 보기

* Class [DateTimeOffset](../datetimeoffset/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator<<(std::wostream\&, TimeSpan) method


스트림에 데이터를 삽입합니다.

```cpp
std::wostream & System::operator<<(std::wostream &stream, TimeSpan time_span)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 스트림 | std::wostream\& | 데이터를 삽입할 출력 스트림입니다. |
| time_span | TimeSpan | 삽입할 [Data](../../system.data/) |

### ReturnValue

**stream**.

## 또 보기

* Class [TimeSpan](../timespan/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
---
title: System::operator>> 메서드
linktitle: operator>>
second_title: Aspose.Page for C++
description: 'System::operator>> 메서드. C++에서 UTF-8 인코딩을 사용하여 입력 스트림으로부터 문자열을 가져옵니다.'
type: docs
weight: 35100
url: /cpp/system/operator__/
---
## System::operator>>(std::istream\&, String\&) method


UTF-8 인코딩을 사용하여 입력 스트림으로부터 문자열을 가져옵니다.

```cpp
std::istream & System::operator>>(std::istream &in, String &str)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| in | std::istream\& | 입력 스트림 객체 (**basic_ostream**를 **char**와 함께 인스턴스화한). |
| str | String\& | 입력 스트림에서 읽을 문자열. |

### ReturnValue

문자열이 추출된 입력 스트림.

## 또 보기

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator>>(std::wistream\&, String\&) method


입력 스트림으로부터 문자열을 가져옵니다.

```cpp
std::wistream & System::operator>>(std::wistream &in, String &str)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| in | std::wistream\& | 입력 스트림 객체 (**basic_ostream**을 **wchar_t**와 함께 인스턴스화한). |
| str | String\& | 입력 스트림에서 읽을 문자열. |

### ReturnValue

문자열이 추출된 입력 스트림.

## 또 보기

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
