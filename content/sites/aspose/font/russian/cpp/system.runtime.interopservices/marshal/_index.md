---
title: "Класс System::Runtime::InteropServices::Marshal"
linktitle: "Marshal"
second_title: "Aspose.Font для C++"
description: "Класс System::Runtime::InteropServices::Marshal. Предоставляет реализацию маршалинга. Только для совместимости с переведённым кодом, так как управляемый код не поддерживается на стороне C++. Это статический тип без сервисов экземпляра. Вы никогда не должны создавать его экземпляры каким-либо способом в C++."
type: docs
weight: 100
url: /ru/cpp/system.runtime.interopservices/marshal/
---
## Marshal class


Предоставляет реализацию маршалинга. Только для совместимости с переведённым кодом, поскольку управляемый код не поддерживается на стороне C++. Это статический тип без сервисов экземпляра. Вы никогда не должны создавать его экземпляры каким-либо способом.

```cpp
class Marshal
```

## Методы

| Метод | Описание |
| --- | --- |
| static [AllocHGlobal](./allochglobal/)(int32_t) | Выделяет неуправляемую память. |
| static [AllocHGlobal](./allochglobal/)(IntPtr) | Выделяет неуправляемую память. |
| static [Copy](./copy/)(const IntPtr, container\&&, int, int) | Реализует семантику public static void Copy(IntPtr source, byte[] destination, int startIndex, int length). |
| static [Copy](./copy/)(const void *, container\&&, int, int) | Реализует семантику public static void Copy(IntPtr source, byte[] destination, int startIndex, int length). |
| static [Copy](./copy/)(const container\&, int, void *, int) | Реализует public static void Copy(char[] source, int startIndex, IntPtr destination, int length). |
| static [Copy](./copy/)(const container\&, int, IntPtr, int) | Реализует public static void Copy(char[] source, int startIndex, IntPtr destination, int length). |
| static [FreeHGlobal](./freehglobal/)(IntPtr) | Освобождает неуправляемую память. |
| static [GetHRForException](./gethrforexception/)(const System::Exception\&) | Получает HResult из исключения. |
| static [PtrToStringAnsi](./ptrtostringansi/)(IntPtr) | Создаёт управляемый [String](../../system/string/) из неуправляемой нуль-терминированной UTF8-строки. |
| static [PtrToStringAnsi](./ptrtostringansi/)(IntPtr, int) | Создаёт управляемый [String](../../system/string/) из неуправляемой UTF8-строки. |
| static [PtrToStringAuto](./ptrtostringauto/)(IntPtr) | Создаёт управляемый [String](../../system/string/) из неуправляемой нуль-терминированной строки. |
| static [PtrToStringAuto](./ptrtostringauto/)(IntPtr, int) | Создаёт управляемый [String](../../system/string/) из неуправляемой строки. |
| static [PtrToStringUni](./ptrtostringuni/)(IntPtr) | Создаёт управляемый [String](../../system/string/) из неуправляемой нуль-терминированной Unicode-строки. |
| static [PtrToStringUni](./ptrtostringuni/)(IntPtr, int) | Создаёт управляемый [String](../../system/string/) из неуправляемой Unicode-строки. |
| static [PtrToStringUTF8](./ptrtostringutf8/)(IntPtr) | Создаёт управляемый [String](../../system/string/) из неуправляемой нуль-терминированной UTF8-строки. |
| static [PtrToStringUTF8](./ptrtostringutf8/)(IntPtr, int) | Создаёт управляемый [String](../../system/string/) из неуправляемой UTF8-строки. |
| static [ReadByte](./readbyte/)(IntPtr, int) | Читает байт из памяти. |
| static [ReadInt16](./readint16/)(IntPtr, int) | Читает short из памяти. |
| static [ReadInt32](./readint32/)(IntPtr, int) | Читает int из памяти. |
| static [SecureStringToGlobalAllocAnsi](./securestringtoglobalallocansi/)(const SharedPtr\<Security::SecureString\>\&) | Копирует содержимое указанной защищённой строки в неуправляемую память, преобразуя в формат ANSI. |
| static [SecureStringToGlobalAllocUnicode](./securestringtoglobalallocunicode/)(const SharedPtr\<Security::SecureString\>\&) | Копирует содержимое указанной защищённой строки в неуправляемую память. |
| static [StringToHGlobalAnsi](./stringtohglobalansi/)(const String\&) | Копирует содержимое указанной строки в неуправляемую память. |
| static [StringToHGlobalAuto](./stringtohglobalauto/)(const String\&) | Копирует содержимое указанной строки в неуправляемую память, преобразуя в формат ANSI при необходимости. |
| static [StringToHGlobalUni](./stringtohglobaluni/)(const String\&) | Копирует содержимое указанной строки в неуправляемую память. |
| static [WriteByte](./writebyte/)(IntPtr, int, uint8_t) | Записывает байт в память. |
| static [WriteByte](./writebyte/)(IntPtr, uint8_t) | Записывает байт в память. |
| static [WriteInt16](./writeint16/)(IntPtr, int, int16_t) | Записывает short в память. |
| static [WriteInt32](./writeint32/)(IntPtr, int, int32_t) | Записывает int в память. |
| static [WriteInt64](./writeint64/)(IntPtr, int, int64_t) | Записывает long в память. |
| static [ZeroFreeGlobalAllocAnsi](./zerofreeglobalallocansi/)(IntPtr) | Освобождает неуправляемый указатель строки, выделенный с помощью метода SecureStringToGlobalAllocAnsi. |
| static [ZeroFreeGlobalAllocUnicode](./zerofreeglobalallocunicode/)(IntPtr) | Освобождает неуправляемый указатель строки, выделенный с помощью метода SecureStringToGlobalAllocUnicode. |
## См. также

* Namespace [System::Runtime::InteropServices](../)
* Library [Aspose.Font for C++](../../)
