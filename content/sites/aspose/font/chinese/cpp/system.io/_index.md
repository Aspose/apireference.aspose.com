---
title: "System::IO 命名空间"
linktitle: "System::IO"
second_title: "Aspose.Font 适用于 C++"
description: "如何在 C++ 中使用 System::IO 命名空间。"
type: docs
weight: 4300
url: /zh/cpp/system.io/
---



## 类

| 类 | 描述 |
| --- | --- |
| [BasicSTDIOStreamWrapper](./basicstdiostreamwrapper/) | 表示一个类似于 [System.IO.Stream](./stream/) 的包装器，用于 std::basic_iostream 及其派生对象。此类的对象只能使用 [System::MakeObject()](../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。 |
| [BasicSTDIStreamWrapper](./basicstdistreamwrapper/) | 表示一个类似于 [System.IO.Stream](./stream/) 的包装器，用于 std::basic_istream 及其派生对象。此类的对象只能使用 [System::MakeObject()](../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。 |
| [BasicSTDOStreamWrapper](./basicstdostreamwrapper/) | 表示一个类似于 [System.IO.Stream](./stream/) 的包装器，用于 std::basic_ostream 及其派生对象。此类的对象只能使用 [System::MakeObject()](../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。 |
| [BasicSystemIOStreamBuf](./basicsystemiostreambuf/) | 表示一个缓冲区，包装类似于 [System::IO::Stream](./stream/) 的流，并允许它们用作 std::iostream 类流的内部缓冲区。 |
| [BasicSystemIOStreamWrapper](./basicsystemiostreamwrapper/) | 表示一个类似于 std::iostream 的包装器，使用 [BasicSystemIOStreamBuf](./basicsystemiostreambuf/) 作为内部缓冲区。 |
| [BasicSystemIStreamWrapper](./basicsystemistreamwrapper/) | 表示一个类似于 std::istream 的包装器，使用 [BasicSystemIOStreamBuf](./basicsystemiostreambuf/) 作为内部缓冲区。 |
| [BasicSystemOStreamWrapper](./basicsystemostreamwrapper/) | 表示一个类似于 std::ostream 的包装器，使用 [BasicSystemIOStreamBuf](./basicsystemiostreambuf/) 作为内部缓冲区。 |
| [BinaryReader](./binaryreader/) | 表示一个读取器，按特定编码将原始数据类型读取为二进制数据。此类的对象只能使用 [System::MakeObject()](../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。 |
| [BinaryWriter](./binarywriter/) | 表示一个写入器，将原始类型的值写入字节流。此类的对象只能使用 [System::MakeObject()](../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。 |
| [BufferedStream](./bufferedstream/) | 在另一个流之上添加缓冲层。此类的对象只能使用 [System::MakeObject()](../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。 |
| [Directory](./directory/) | 包含用于操作目录的方法。这是一个没有实例服务的静态类型。绝不应以任何方式创建其实例。 |
| [DirectoryInfo](./directoryinfo/) | 表示一个文件系统路径、该路径指向的目录，并提供用于操作目录的实例方法。此类的对象只能使用 [System::MakeObject()](../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。 |
| [File](./file/) | 提供用于操作文件的方法。这是一个没有实例服务的静态类型。绝不应以任何方式创建其实例。 |
| [FileInfo](./fileinfo/) | 表示指向文件的路径以及该路径所指的文件，并提供用于操作该文件的方法。此类的对象只能使用 [System::MakeObject()](../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。 |
| [FileStream](./filestream/) | 表示支持同步和异步读写操作的文件流。此类的对象只能使用 [System::MakeObject()](../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。 |
| [FileSystemInfo](./filesysteminfo/) | 是 [FileInfo](./fileinfo/) 和 [DirectoryInfo](./directoryinfo/) 的基类。此类的对象只能使用 [System::MakeObject()](../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。 |
| [FileSystemInfoStat](./filesysteminfostat/) | 表示文件或目录的信息。 |
| [MemoryStream](./memorystream/) | 表示一个从内存读取并写入内存的流。此类的对象只能使用 [System::MakeObject()](../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。 |
| [Path](./path/) | 提供用于操作路径的方法。这是一个没有实例服务的静态类型。绝不应以任何方式创建其实例。 |
| [STDIOStreamWrapperBase](./stdiostreamwrapperbase/) | 表示一个用于 [System.IO.Stream](./stream/) 类包装器的基类。此类的对象只能使用 [System::MakeObject()](../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。 |
| [Stream](./stream/) | 一个用于多种流实现的基类。此类的对象只能使用 [System::MakeObject()](../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。 |
| [StreamReader](./streamreader/) | 表示一个从字节流读取字符的读取器。此类的对象只能使用 [System::MakeObject()](../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。 |
| [StreamWriter](./streamwriter/) | 表示一个向字节流写入字符的写入器。此类的对象只能使用 [System::MakeObject()](../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。 |
| [StringReader](./stringreader/) | 表示一个从字符串读取字符的读取器。此类的对象只能使用 [System::MakeObject()](../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。 |
| [StringWriter](./stringwriter/) | 实现一个将信息写入字符串的 [TextWriter](./textwriter/)。此类的对象只能使用 [System::MakeObject()](../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。 |
| [TextReader](./textreader/) | 一个用于表示从不同来源读取字符序列的读取器的基类。此类的对象只能使用 [System::MakeObject()](../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。 |
| [TextWriter](./textwriter/) | 一个用于表示向不同目标写入字符序列的写入器的基类。此类的对象只能使用 [System::MakeObject()](../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。 |
| [UnmanagedMemoryStream](./unmanagedmemorystream/) | 提供对非托管内存的访问。此类的对象只能使用 [System::MakeObject()](../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。 |
## Enums

| 枚举 | 描述 |
| --- | --- |
| [FileAccess](./fileaccess/) | 指定打开文件时的访问类型。 |
| [FileAttributes](./fileattributes/) | 表示目录或文件的属性。 |
| [FileMode](./filemode/) | 指定文件的打开方式。 |
| [FileOptions](./fileoptions/) | 表示创建 [FileStream](./filestream/) 对象的高级选项。 |
| [FileShare](./fileshare/) | 指定其他 [FileStream](./filestream/) 对象对正在打开的文件可以拥有的访问类型。 |
| [SearchOption](./searchoption/) | 指定搜索应仅在当前目录进行，或在当前目录及其所有子目录中进行。 |
| [SeekOrigin](./seekorigin/) | 指定流中的参考位置，相对于该位置指定要定位的目标位置。 |
| [STDIOStreamPositionPreference](./stdiostreampositionpreference/) | 确定在创建包装器时，当 std::basic_iostream 及其派生类具有不同的读取和写入位置时，流中哪个位置更适合作为公共的读写位置。 |
| [STDIOStreamWrappingMode](./stdiostreamwrappingmode/) | 指定包装器将在类似 std::iostream 的流上执行的 I/O 操作模式。 |
| [SystemIOStreamWrappingMode](./systemiostreamwrappingmode/) | 指定包装器将在类似 [System::IO::Stream](./stream/) 的流上执行的 I/O 操作模式。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [BinaryWriterPtr](./binarywriterptr/) | 此类的共享指针别名。 |
| [FileNotFoundException](./filenotfoundexception/) | 当尝试访问磁盘上不存在的文件失败时抛出的异常。切勿将 [FileNotFoundException](./filenotfoundexception/) 类实例包装到 [System::SmartPtr](../system/smartptr/) 中。 |
| [IsTemplateBaseOf](./istemplatebaseof/) | 表示 std::is_base_of<Base, Derived> 的对应实现，用于确定未实例化的 Base 模板类是否从已实例化的 Derived 模板类继承。若出现多重继承或非公共继承自 Base 将导致失败。 |
| [STDIOStreamWrapper](./stdiostreamwrapper/) | [BasicSTDIOStreamWrapper](./basicstdiostreamwrapper/) 对 char 字符类型的特化。 |
| [STDIStreamWrapper](./stdistreamwrapper/) | [BasicSTDIStreamWrapper](./basicstdistreamwrapper/) 对 char 字符类型的特化。 |
| [STDOStreamWrapper](./stdostreamwrapper/) | [BasicSTDOStreamWrapper](./basicstdostreamwrapper/) 对 char 字符类型的特化。 |
| [STDWIOStreamWrapper](./stdwiostreamwrapper/) | [BasicSTDIOStreamWrapper](./basicstdiostreamwrapper/) 对 wchar_t 字符类型的特化。 |
| [STDWIStreamWrapper](./stdwistreamwrapper/) | [BasicSTDIStreamWrapper](./basicstdistreamwrapper/) 对 wchar_t 字符类型的特化。 |
| [STDWOStreamWrapper](./stdwostreamwrapper/) | 针对 wchar_t 字符类型的 [BasicSTDOStreamWrapper](./basicstdostreamwrapper/) 特化。 |
| [SystemIOStreamWrapper](./systemiostreamwrapper/) | 针对 char 字符类型的 [BasicSystemIOStreamWrapper](./basicsystemiostreamwrapper/) 特化。 |
| [SystemIStreamWrapper](./systemistreamwrapper/) | 针对 char 字符类型的 [BasicSystemIStreamWrapper](./basicsystemistreamwrapper/) 特化。 |
| [SystemOStreamWrapper](./systemostreamwrapper/) | 针对 char 字符类型的 [BasicSystemOStreamWrapper](./basicsystemostreamwrapper/) 特化。 |
| [SystemWIOStreamWrapper](./systemwiostreamwrapper/) | 针对 wchar_t 字符类型的 [BasicSystemIOStreamWrapper](./basicsystemiostreamwrapper/) 特化。 |
| [SystemWIStreamWrapper](./systemwistreamwrapper/) | 针对 wchar_t 字符类型的 [BasicSystemIStreamWrapper](./basicsystemistreamwrapper/) 特化。 |
| [SystemWOStreamWrapper](./systemwostreamwrapper/) | 针对 wchar_t 字符类型的 [BasicSystemOStreamWrapper](./basicsystemostreamwrapper/) 特化。 |
## Functions

| 函数 | 描述 |
| --- | --- |
| WrapSTDIOStream | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| WrapSTDIOStream | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| WrapSTDIOStream | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
