---
title: "Метод System::Xml::XmlReader::Create"
linktitle: "Создать"
second_title: "Aspose.Page для C++"
description: "Метод System::Xml::XmlReader::Create. Создаёт новый экземпляр XmlReader, используя указанный поток с настройками по умолчанию, в C++."
type: docs
weight: 7700
url: /ru/cpp/system.xml/xmlreader/create/
---
## XmlReader::Create(const SharedPtr\<IO::Stream\>\&) method


Создаёт новый экземпляр [XmlReader](../), используя указанный поток с настройками по умолчанию.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<IO::Stream> &input)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| input | const SharedPtr\<IO::Stream\>\& | Поток, содержащий XML‑данные. [XmlReader](../) сканирует первые байты потока в поисках маркера порядка байтов или другого признака кодировки. Когда кодировка определена, она используется для дальнейшего чтения потока, и обработка продолжает разбирать ввод как поток (Unicode) символов. |

### ReturnValue

Объект, используемый для чтения XML‑данных из потока.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [Stream](../../../system.io/stream/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::Create(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<XmlReaderSettings\>\&) method


Создаёт новый экземпляр [XmlReader](../) с указанным потоком и настройками.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<IO::Stream> &input, const SharedPtr<XmlReaderSettings> &settings)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| input | const SharedPtr\<IO::Stream\>\& | Поток, содержащий XML‑данные. [XmlReader](../) сканирует первые байты потока в поисках маркера порядка байтов или другого признака кодировки. Когда кодировка определена, она используется для дальнейшего чтения потока, и обработка продолжает разбирать ввод как поток (Unicode) символов. |
| settings | const SharedPtr\<XmlReaderSettings\>\& | Настройки для нового экземпляра [XmlReader](../). Это значение может быть **nullptr**. |

### ReturnValue

Объект, используемый для чтения XML‑данных из потока.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [Stream](../../../system.io/stream/)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::Create(const SharedPtr\<IO::Stream\>\&, SharedPtr\<XmlReaderSettings\>, const SharedPtr\<XmlParserContext\>\&) method


Создаёт новый экземпляр [XmlReader](../), используя указанный поток, настройки и контекстную информацию для разбора.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<IO::Stream> &input, SharedPtr<XmlReaderSettings> settings, const SharedPtr<XmlParserContext> &inputContext)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| input | const SharedPtr\<IO::Stream\>\& | Поток, содержащий XML‑данные. [XmlReader](../) сканирует первые байты потока в поисках маркера порядка байтов или другого признака кодировки. Когда кодировка определена, она используется для дальнейшего чтения потока, и обработка продолжает разбирать ввод как поток (Unicode) символов. |
| settings | SharedPtr\<XmlReaderSettings\> | Настройки для нового экземпляра [XmlReader](../). Это значение может быть **nullptr**. |
| inputContext | const SharedPtr\<XmlParserContext\>\& | Контекстная информация, необходимая для разбора XML‑фрагмента. Контекст может включать используемую [XmlNameTable](../../xmlnametable/), кодировку, область пространств имён, текущие области **xml:lang** и **xml:space**, базовый URI и определение типа документа. Это значение может быть **nullptr**. |

### ReturnValue

Объект, используемый для чтения XML‑данных из потока.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [Stream](../../../system.io/stream/)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [XmlParserContext](../../xmlparsercontext/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::Create(const SharedPtr\<IO::Stream\>\&, SharedPtr\<XmlReaderSettings\>, const String\&) method


Создаёт новый экземпляр [XmlReader](../), используя указанный поток, базовый URI и настройки.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<IO::Stream> &input, SharedPtr<XmlReaderSettings> settings, const String &baseUri)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| input | const SharedPtr\<IO::Stream\>\& | Поток, содержащий XML‑данные. [XmlReader](../) сканирует первые байты потока в поисках маркера порядка байтов или другого признака кодировки. Когда кодировка определена, она используется для дальнейшего чтения потока, и обработка продолжает разбирать ввод как поток (Unicode) символов. |
| settings | SharedPtr\<XmlReaderSettings\> | Настройки для нового экземпляра [XmlReader](../). Это значение может быть **nullptr**. |
| baseUri | const String\& | Базовый URI для читаемой сущности или документа. Это значение может быть **nullptr**. **[Security](../../../system.security/) Note** Базовый URI используется для разрешения относительного URI XML‑документа. Не используйте базовый URI из ненадёжного источника. |

### ReturnValue

Объект, используемый для чтения XML‑данных из потока.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [Stream](../../../system.io/stream/)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::Create(const SharedPtr\<IO::TextReader\>\&) method


Создает новый экземпляр [XmlReader](../), используя указанный текстовый читатель.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<IO::TextReader> &input)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| input | const SharedPtr\<IO::TextReader\>\& | Текстовый читатель, из которого читаются данные XML. Текстовый читатель возвращает поток символов Unicode, поэтому кодировка, указанная в объявлении XML, не используется XML‑читателем для декодирования потока данных. |

### ReturnValue

Объект, используемый для чтения XML‑данных из потока.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [TextReader](../../../system.io/textreader/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::Create(const SharedPtr\<IO::TextReader\>\&, const SharedPtr\<XmlReaderSettings\>\&) method


Создает новый экземпляр [XmlReader](../), используя указанный текстовый читатель и параметры.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<IO::TextReader> &input, const SharedPtr<XmlReaderSettings> &settings)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| input | const SharedPtr\<IO::TextReader\>\& | Текстовый читатель, из которого читаются данные XML. Текстовый читатель возвращает поток символов Unicode, поэтому кодировка, указанная в объявлении XML, не используется XML‑читателем для декодирования потока данных. |
| settings | const SharedPtr\<XmlReaderSettings\>\& | Параметры для нового [XmlReader](../). Это значение может быть **nullptr**. |

### ReturnValue

Объект, используемый для чтения XML‑данных из потока.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [TextReader](../../../system.io/textreader/)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::Create(const SharedPtr\<IO::TextReader\>\&, SharedPtr\<XmlReaderSettings\>, const SharedPtr\<XmlParserContext\>\&) method


Создает новый экземпляр [XmlReader](../), используя указанный текстовый читатель, параметры и контекстную информацию для разбора.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<IO::TextReader> &input, SharedPtr<XmlReaderSettings> settings, const SharedPtr<XmlParserContext> &inputContext)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| input | const SharedPtr\<IO::TextReader\>\& | Текстовый читатель, из которого читаются данные XML. Текстовый читатель возвращает поток символов Unicode, поэтому кодировка, указанная в объявлении XML, не используется XML‑читателем для декодирования потока данных. |
| settings | SharedPtr\<XmlReaderSettings\> | Настройки для нового экземпляра [XmlReader](../). Это значение может быть **nullptr**. |
| inputContext | const SharedPtr\<XmlParserContext\>\& | Контекстная информация, необходимая для разбора XML‑фрагмента. Контекст может включать используемую [XmlNameTable](../../xmlnametable/), кодировку, область пространств имён, текущие области **xml:lang** и **xml:space**, базовый URI и определение типа документа. Это значение может быть **nullptr**. |

### ReturnValue

Объект, используемый для чтения XML‑данных из потока.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [TextReader](../../../system.io/textreader/)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [XmlParserContext](../../xmlparsercontext/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::Create(const SharedPtr\<IO::TextReader\>\&, SharedPtr\<XmlReaderSettings\>, const String\&) method


Создает новый экземпляр [XmlReader](../), используя указанный текстовый читатель, параметры и базовый URI.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<IO::TextReader> &input, SharedPtr<XmlReaderSettings> settings, const String &baseUri)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| input | const SharedPtr\<IO::TextReader\>\& | Текстовый читатель, из которого читаются данные XML. Текстовый читатель возвращает поток символов Unicode, поэтому кодировка, указанная в объявлении XML, не используется [XmlReader](../) для декодирования потока данных. |
| settings | SharedPtr\<XmlReaderSettings\> | Настройки для нового экземпляра [XmlReader](../). Это значение может быть **nullptr**. |
| baseUri | const String\& | Базовый URI для читаемой сущности или документа. Это значение может быть **nullptr**. **[Security](../../../system.security/) Note** Базовый URI используется для разрешения относительного URI XML‑документа. Не используйте базовый URI из ненадёжного источника. |

### ReturnValue

Объект, используемый для чтения XML‑данных из потока.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [TextReader](../../../system.io/textreader/)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::Create(const SharedPtr\<XmlReader\>\&, SharedPtr\<XmlReaderSettings\>) method


Создает новый экземпляр [XmlReader](../), используя указанный XML‑читатель и параметры.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const SharedPtr<XmlReader> &reader, SharedPtr<XmlReaderSettings> settings)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| чтатель | const SharedPtr\<XmlReader\>\& | Объект, который вы хотите использовать в качестве базового XML‑читателя. |
| settings | SharedPtr\<XmlReaderSettings\> | Параметры для нового экземпляра [XmlReader](../). Уровень соответствия объекта [XmlReaderSettings](../../xmlreadersettings/) должен либо совпадать с уровнем соответствия базового читателя, либо быть установлен в значение [ConformanceLevel::Auto](../../conformancelevel/). |

### ReturnValue

Объект, который оборачивает указанный объект [XmlReader](../).

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::Create(const String\&) method


Создает новый экземпляр [XmlReader](../) с указанным URI.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const String &inputUri)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| inputUri | const String\& | URI файла, содержащего данные XML. Класс [XmlUrlResolver](../../xmlurlresolver/) используется для преобразования пути в каноническое представление данных. |

### ReturnValue

Объект, используемый для чтения XML‑данных из потока.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::Create(const String\&, const SharedPtr\<XmlReaderSettings\>\&) method


Создает новый экземпляр [XmlReader](../), используя указанный URI и параметры.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const String &inputUri, const SharedPtr<XmlReaderSettings> &settings)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| inputUri | const String\& | URI файла, содержащего данные XML. Объект [XmlResolver](../../xmlresolver/) в объекте [XmlReaderSettings](../../xmlreadersettings/) используется для преобразования пути в каноническое представление данных. Если значение XmlReaderSettings::get_XmlResolver равно **nullptr**, используется новый объект [XmlUrlResolver](../../xmlurlresolver/). |
| settings | const SharedPtr\<XmlReaderSettings\>\& | Настройки для нового экземпляра [XmlReader](../). Это значение может быть **nullptr**. |

### ReturnValue

Объект, используемый для чтения XML‑данных из потока.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [String](../../../system/string/)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::Create(const String\&, SharedPtr\<XmlReaderSettings\>, const SharedPtr\<XmlParserContext\>\&) method


Создает новый экземпляр [XmlReader](../), используя указанный URI, параметры и контекстную информацию для разбора.

```cpp
static SharedPtr<XmlReader> System::Xml::XmlReader::Create(const String &inputUri, SharedPtr<XmlReaderSettings> settings, const SharedPtr<XmlParserContext> &inputContext)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| inputUri | const String\& | URI файла, содержащего данные XML. Объект [XmlResolver](../../xmlresolver/) в объекте [XmlReaderSettings](../../xmlreadersettings/) используется для преобразования пути в каноническое представление данных. Если значение XmlReaderSettings::get_XmlResolver равно **nullptr**, используется новый объект [XmlUrlResolver](../../xmlurlresolver/). |
| settings | SharedPtr\<XmlReaderSettings\> | Настройки для нового экземпляра [XmlReader](../). Это значение может быть **nullptr**. |
| inputContext | const SharedPtr\<XmlParserContext\>\& | Контекстная информация, необходимая для разбора XML‑фрагмента. Контекст может включать используемую [XmlNameTable](../../xmlnametable/), кодировку, область пространств имён, текущие области **xml:lang** и **xml:space**, базовый URI и определение типа документа. Это значение может быть **nullptr**. |

### ReturnValue

Объект, используемый для чтения XML‑данных из потока.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [String](../../../system/string/)
* Class [XmlReaderSettings](../../xmlreadersettings/)
* Class [XmlParserContext](../../xmlparsercontext/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
