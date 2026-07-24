---
title: "System::Xml::XmlWriter::Create method"
linktitle: "생성"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlWriter::Create 메서드. 지정된 스트림을 사용하여 새로운 XmlWriter 인스턴스를 생성합니다(C++)."
type: docs
weight: 3700
url: /ko/cpp/system.xml/xmlwriter/create/
---
## XmlWriter::Create(const SharedPtr\<IO::Stream\>\&) method


지정된 스트림을 사용하여 새로운 [XmlWriter](../) 인스턴스를 생성합니다.

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const SharedPtr<IO::Stream> &output)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| output | const SharedPtr\<IO::Stream\>\& | 쓰기 원하는 스트림입니다. [XmlWriter](../)는 XML 1.0 텍스트 구문을 작성하고 지정된 스트림에 추가합니다. |

### ReturnValue

[XmlWriter](../) 객체입니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [Stream](../../../system.io/stream/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlWriter::Create(const SharedPtr\<IO::Stream\>\&, SharedPtr\<XmlWriterSettings\>) method


스트림과 [XmlWriterSettings](../../xmlwritersettings/) 객체를 사용하여 새로운 [XmlWriter](../) 인스턴스를 생성합니다.

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const SharedPtr<IO::Stream> &output, SharedPtr<XmlWriterSettings> settings)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| output | const SharedPtr\<IO::Stream\>\& | 쓰기 원하는 스트림입니다. [XmlWriter](../)는 XML 1.0 텍스트 구문을 작성하고 지정된 스트림에 추가합니다. |
| settings | SharedPtr\<XmlWriterSettings\> | [XmlWriterSettings](../../xmlwritersettings/) 객체는 새로운 [XmlWriter](../) 인스턴스를 구성하는 데 사용됩니다. 이 값이 **nullptr**인 경우, 기본 설정을 가진 [XmlWriterSettings](../../xmlwritersettings/)가 사용됩니다. [XmlWriter](../)를 XslCompiledTransform:Transform(String,SharedPtr<XmlWriter>) 메서드와 함께 사용하는 경우, XslCompiledTransform::get_OutputSettings 값을 사용하여 올바른 설정을 가진 [XmlWriterSettings](../../xmlwritersettings/) 객체를 얻어야 합니다. 이렇게 하면 생성된 [XmlWriter](../) 객체가 올바른 출력 설정을 갖게 됩니다. |

### ReturnValue

[XmlWriter](../) 객체입니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [Stream](../../../system.io/stream/)
* Class [XmlWriterSettings](../../xmlwritersettings/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlWriter::Create(const SharedPtr\<IO::TextWriter\>\&) method


지정된 TextWriter를 사용하여 새로운 [XmlWriter](../) 인스턴스를 생성합니다.

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const SharedPtr<IO::TextWriter> &output)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| output | const SharedPtr\<IO::TextWriter\>\& | 쓰기 원하는 TextWriter입니다. [XmlWriter](../)는 XML 1.0 텍스트 구문을 작성하고 지정된 TextWriter에 추가합니다. |

### ReturnValue

[XmlWriter](../) 객체입니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlWriter::Create(const SharedPtr\<IO::TextWriter\>\&, SharedPtr\<XmlWriterSettings\>) method


TextWriter와 [XmlWriterSettings](../../xmlwritersettings/) 객체를 사용하여 새로운 [XmlWriter](../) 인스턴스를 생성합니다.

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const SharedPtr<IO::TextWriter> &output, SharedPtr<XmlWriterSettings> settings)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| output | const SharedPtr\<IO::TextWriter\>\& | 쓰기 원하는 TextWriter입니다. [XmlWriter](../)는 XML 1.0 텍스트 구문을 작성하고 지정된 TextWriter에 추가합니다. |
| settings | SharedPtr\<XmlWriterSettings\> | [XmlWriterSettings](../../xmlwritersettings/) 객체는 새로운 [XmlWriter](../) 인스턴스를 구성하는 데 사용됩니다. 이 값이 **nullptr**인 경우, 기본 설정을 가진 [XmlWriterSettings](../../xmlwritersettings/)가 사용됩니다. [XmlWriter](../)를 XslCompiledTransform:Transform(String,SharedPtr<XmlWriter>) 메서드와 함께 사용하는 경우, XslCompiledTransform::get_OutputSettings 값을 사용하여 올바른 설정을 가진 [XmlWriterSettings](../../xmlwritersettings/) 객체를 얻어야 합니다. 이렇게 하면 생성된 [XmlWriter](../) 객체가 올바른 출력 설정을 갖게 됩니다. |

### ReturnValue

[XmlWriter](../) 객체입니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XmlWriterSettings](../../xmlwritersettings/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlWriter::Create(const SharedPtr\<Text::StringBuilder\>\&) method


지정된 [Text::StringBuilder](../../../system.text/stringbuilder/)를 사용하여 새로운 [XmlWriter](../) 인스턴스를 생성합니다.

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const SharedPtr<Text::StringBuilder> &output)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| output | const SharedPtr\<Text::StringBuilder\>\& | 쓰기 대상인 [Text::StringBuilder](../../../system.text/stringbuilder/)입니다. [XmlWriter](../)가 작성한 내용은 [Text::StringBuilder](../../../system.text/stringbuilder/)에 추가됩니다. |

### ReturnValue

[XmlWriter](../) 객체입니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [StringBuilder](../../../system.text/stringbuilder/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlWriter::Create(const SharedPtr\<Text::StringBuilder\>\&, SharedPtr\<XmlWriterSettings\>) method


[Text::StringBuilder](../../../system.text/stringbuilder/)와 [XmlWriterSettings](../../xmlwritersettings/) 객체를 사용하여 새로운 [XmlWriter](../) 인스턴스를 생성합니다.

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const SharedPtr<Text::StringBuilder> &output, SharedPtr<XmlWriterSettings> settings)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| output | const SharedPtr\<Text::StringBuilder\>\& | 쓰기 대상인 [Text::StringBuilder](../../../system.text/stringbuilder/)입니다. [XmlWriter](../)가 작성한 내용은 [Text::StringBuilder](../../../system.text/stringbuilder/)에 추가됩니다. |
| settings | SharedPtr\<XmlWriterSettings\> | [XmlWriterSettings](../../xmlwritersettings/) 객체는 새로운 [XmlWriter](../) 인스턴스를 구성하는 데 사용됩니다. 이 값이 **nullptr**인 경우, 기본 설정을 가진 [XmlWriterSettings](../../xmlwritersettings/)가 사용됩니다. [XmlWriter](../)를 XslCompiledTransform:Transform(String,SharedPtr<XmlWriter>) 메서드와 함께 사용하는 경우, XslCompiledTransform::get_OutputSettings 값을 사용하여 올바른 설정을 가진 [XmlWriterSettings](../../xmlwritersettings/) 객체를 얻어야 합니다. 이렇게 하면 생성된 [XmlWriter](../) 객체가 올바른 출력 설정을 갖게 됩니다. |

### ReturnValue

[XmlWriter](../) 객체입니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [StringBuilder](../../../system.text/stringbuilder/)
* Class [XmlWriterSettings](../../xmlwritersettings/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlWriter::Create(const SharedPtr\<XmlWriter\>\&) method


지정된 [XmlWriter](../) 객체를 사용하여 새로운 [XmlWriter](../) 인스턴스를 생성합니다.

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const SharedPtr<XmlWriter> &output)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| output | const SharedPtr\<XmlWriter\>\& | 기본 작성기로 사용하려는 [XmlWriter](../) 객체입니다. |

### ReturnValue

지정된 [XmlWriter](../) 객체를 감싸는 [XmlWriter](../) 객체입니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlWriter::Create(const SharedPtr\<XmlWriter\>\&, SharedPtr\<XmlWriterSettings\>) method


지정된 [XmlWriter](../) 및 [XmlWriterSettings](../../xmlwritersettings/) 객체를 사용하여 새로운 [XmlWriter](../) 인스턴스를 생성합니다.

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const SharedPtr<XmlWriter> &output, SharedPtr<XmlWriterSettings> settings)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| output | const SharedPtr\<XmlWriter\>\& | 기본 작성기로 사용하려는 [XmlWriter](../) 객체입니다. |
| settings | SharedPtr\<XmlWriterSettings\> | [XmlWriterSettings](../../xmlwritersettings/) 객체는 새로운 [XmlWriter](../) 인스턴스를 구성하는 데 사용됩니다. 이 값이 **nullptr**인 경우, 기본 설정을 가진 [XmlWriterSettings](../../xmlwritersettings/)가 사용됩니다. [XmlWriter](../)를 XslCompiledTransform:Transform(String,SharedPtr<XmlWriter>) 메서드와 함께 사용하는 경우, XslCompiledTransform::get_OutputSettings 값을 사용하여 올바른 설정을 가진 [XmlWriterSettings](../../xmlwritersettings/) 객체를 얻어야 합니다. 이렇게 하면 생성된 [XmlWriter](../) 객체가 올바른 출력 설정을 갖게 됩니다. |

### ReturnValue

지정된 [XmlWriter](../) 객체를 감싸는 [XmlWriter](../) 객체입니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [XmlWriterSettings](../../xmlwritersettings/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlWriter::Create(const String\&) method


지정된 파일 이름을 사용하여 새로운 [XmlWriter](../) 인스턴스를 생성합니다.

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const String &outputFileName)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| outputFileName | const String\& | 쓰기 원하는 파일입니다. [XmlWriter](../)는 지정된 경로에 파일을 생성하고 XML 1.0 텍스트 구문으로 기록합니다. **outputFileName**은 파일 시스템 경로여야 합니다. |

### ReturnValue

[XmlWriter](../) 객체입니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [String](../../../system/string/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlWriter::Create(const String\&, SharedPtr\<XmlWriterSettings\>) method


파일 이름과 [XmlWriterSettings](../../xmlwritersettings/) 객체를 사용하여 새로운 [XmlWriter](../) 인스턴스를 생성합니다.

```cpp
static SharedPtr<XmlWriter> System::Xml::XmlWriter::Create(const String &outputFileName, SharedPtr<XmlWriterSettings> settings)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| outputFileName | const String\& | 쓰기 원하는 파일입니다. [XmlWriter](../)는 지정된 경로에 파일을 생성하고 XML 1.0 텍스트 구문으로 기록합니다. **outputFileName**은 파일 시스템 경로여야 합니다. |
| settings | SharedPtr\<XmlWriterSettings\> | [XmlWriterSettings](../../xmlwritersettings/) 객체는 새로운 [XmlWriter](../) 인스턴스를 구성하는 데 사용됩니다. 이 값이 **nullptr**인 경우, 기본 설정을 가진 [XmlWriterSettings](../../xmlwritersettings/)가 사용됩니다. [XmlWriter](../)를 XslCompiledTransform:Transform(String,SharedPtr<XmlWriter>) 메서드와 함께 사용하는 경우, XslCompiledTransform::get_OutputSettings 값을 사용하여 올바른 설정을 가진 [XmlWriterSettings](../../xmlwritersettings/) 객체를 얻어야 합니다. 이렇게 하면 생성된 [XmlWriter](../) 객체가 올바른 출력 설정을 갖게 됩니다. |

### ReturnValue

[XmlWriter](../) 객체입니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../)
* Class [String](../../../system/string/)
* Class [XmlWriterSettings](../../xmlwritersettings/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
