---
title: "System 命名空间"
linktitle: "System"
second_title: "Aspose.Page 适用于 C++"
description: "如何在 C++ 中使用 System 命名空间。"
type: docs
weight: 2100
url: /zh/cpp/system/
---



## 类

| 类 | 描述 |
| --- | --- |
| [Activator](./activator/) | 包含用于创建对象类型的方法。 |
| [Array](./array/) | 表示数组数据结构的类。此类的对象只能使用 [System::MakeArray()](./makearray/) 和 [System::MakeObject()](./makeobject/) 函数进行分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装为 [System::SmartPtr](./smartptr/) 指针，并使用该指针将其作为参数传递给函数。 |
| [ArraySegment](./arraysegment/) | 表示一维数组的片段。此类型应在栈上分配，并通过值或引用传递给函数。切勿使用 [System::SmartPtr](./smartptr/) 类来管理此类型的对象。 |
| [Attribute](./attribute/) | 自定义属性的基类。此类的对象只能使用 [System::MakeObject()](./makeobject/) 函数进行分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装为 [System::SmartPtr](./smartptr/) 指针，并使用该指针将其作为参数传递给函数。 |
| [BitConverter](./bitconverter/) | 包含执行字节序列与值类型相互转换的方法。这是一个没有实例服务的静态类型。任何情况下都不应创建其实例。 |
| [Boolean](./boolean/) | 保存 [System.Boolean](./boolean/) .[Net](../system.net/) 类型的静态成员的类。 |
| [BoxedEnum](./boxedenum/) | 表示装箱的枚举值。此类的对象只能使用 [System::MakeObject()](./makeobject/) 函数进行分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装为 [System::SmartPtr](./smartptr/) 指针，并使用该指针将其作为参数传递给函数。 |
| [BoxedValue](./boxedvalue/) | 表示装箱的值。此类的对象只能使用 [System::MakeObject()](./makeobject/) 函数进行分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装为 [System::SmartPtr](./smartptr/) 指针，并使用该指针将其作为参数传递给函数。 |
| [BoxedValueBase](./boxedvaluebase/) | 定义接口并实现表示装箱值的派生类的一些基本方法的基类。此类的对象只能使用 [System::MakeObject()](./makeobject/) 函数进行分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装为 [System::SmartPtr](./smartptr/) 指针，并使用该指针将其作为参数传递给函数。 |
| [Buffer](./buffer/) | 包含操作原始字节数组的方法。这是一个没有实例服务的静态类型。任何情况下都不应创建其实例。 |
| [Byte](./byte/) | 包含处理无符号 8 位整数的方法。 |
| [Char](./char/) | 提供对以 UTF-16 代码单元表示的字符进行操作的方法。这是一个没有实例服务的静态类型。任何情况下都不应创建其实例。 |
| [Comparison](./comparison/) | 表示比较同类型两个对象的方法的指针。此类型应在栈上分配，并通过值或引用传递给函数。切勿使用 [System::SmartPtr](./smartptr/) 类来管理此类型的对象。 |
| [Console](./console/) | 提供向标准输出流输出数据的方法。这是一个没有实例服务的静态类型。任何情况下都不应创建其实例。 |
| [ConsoleOutput](./consoleoutput/) | 表示标准输出流。此类的对象只能使用 [System::MakeObject()](./makeobject/) 函数进行分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装为 [System::SmartPtr](./smartptr/) 指针，并使用该指针将其作为参数传递给函数。 |
| [DateTime](./datetime/) | 表示时间连续体上的特定日期和时间值。此类型应在栈上分配，并通过值或引用传递给函数。切勿使用 [System::SmartPtr](./smartptr/) 类来管理此类型的对象。 |
| [DateTimeOffset](./datetimeoffset/) | 包含相对于协调世界时的日期和时间。此类的对象只能使用 [System::MakeObject()](./makeobject/) 函数进行分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装为 [System::SmartPtr](./smartptr/) 指针，并使用该指针将其作为参数传递给函数。 |
| [DBNull](./dbnull/) | 表示不存在的值。此类的对象只能使用 [System::MakeObject()](./makeobject/) 函数进行分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装为 [System::SmartPtr](./smartptr/) 指针，并使用该指针将其作为参数传递给函数。 |
| [Decimal](./decimal/) | 表示十进制数。此类型应在栈上分配，并通过值或引用传递给函数。切勿使用 [System::SmartPtr](./smartptr/) 类来管理此类型的对象。 |
| [DefaultBoxedValue](./defaultboxedvalue/) | [BoxedValue](./boxedvalue/) 类的实现。允许在不复制公共代码的情况下声明其 BoxingValue 特化。此类的对象只能使用 [System::MakeObject()](./makeobject/) 函数进行分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装为 [System::SmartPtr](./smartptr/) 指针，并使用该指针将其作为参数传递给函数。 |
| [Delegate< ReturnType(ArgumentTypes...)>](./delegate_returntype(argumenttypes...)_/) | 表示指向函数、方法或函数对象的指针。此类型应在栈上分配，并通过值或引用传递给函数。切勿使用 [System::SmartPtr](./smartptr/) 类来管理此类型的对象。 |
| [DynamicWeakPtr](./dynamicweakptr/) | 智能指针类，用于跟踪存储对象的模板参数的指针模式，并在每次赋值后更新它们。此类型是用于管理其他对象删除的指针。它应在栈上分配，并通过值或 const 引用传递给函数。 |
| [EnumValues](./enumvalues/) | 提供枚举类型 **E** 的枚举常量的元信息。 |
| [EnumValuesBase](./enumvaluesbase/) | 表示枚举类型元信息的类的基类。 |
| [EventArgs](./eventargs/) | 表示在触发事件时传递给事件订阅者的上下文的类的基类。此类的对象只能使用 [System::MakeObject()](./makeobject/) 函数进行分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装为 [System::SmartPtr](./smartptr/) 指针，并使用该指针将其作为参数传递给函数。 |
| [ExceptionWrapper](./exceptionwrapper/) | 模板，表示从 [Exception](./exception/) 类派生的异常的包装器。 |
| [FlagsAttribute](./flagsattribute/) | 指示枚举可以被视为位字段；即，一组。 |
| [Func](./func/) | 函数委托。此类型应在栈上分配，并通过值或引用传递给函数。切勿使用 [System::SmartPtr](./smartptr/) 类来管理此类型的对象。 |
| [GC](./gc/) | 表示一种模拟的垃圾回收，它更像一个实际上不执行任何操作的存根。这是一个没有实例服务的静态类型。无论何种方式都不应创建其实例。 |
| [Guid](./guid/) | 表示全局唯一标识符（GUID）。此类型应在栈上分配，并通过值或引用传递给函数。切勿使用 [System::SmartPtr](./smartptr/) 类来管理此类型的对象。 |
| [IAsyncResult](./iasyncresult/) | 表示异步操作的状态。此类的对象只能使用 [System::MakeObject()](./makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](./smartptr/) 指针中，并使用该指针作为参数传递给函数。 |
| [ICloneable](./icloneable/) | 定义一个方法以实现对象克隆——创建对象的副本。此类的对象只能使用 [System::MakeObject()](./makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](./smartptr/) 指针中，并使用该指针作为参数传递给函数。 |
| [IComparable](./icomparable/) | 定义一个方法来比较两个对象。此类的对象只能使用 [System::MakeObject()](./makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](./smartptr/) 指针中，并使用该指针作为参数传递给函数。 |
| [IConvertible](./iconvertible/) | 定义一组方法，将实现的引用或值类型的值转换为具有等价值的公共语言运行时类型。此类的对象只能使用 [System::MakeObject()](./makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](./smartptr/) 指针中，并使用该指针作为参数传递给函数。 |
| [ICustomFormatter](./icustomformatter/) | 定义一个方法，对指定对象表示的值的字符串表示进行自定义格式化。此类的对象只能使用 [System::MakeObject()](./makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](./smartptr/) 指针中，并使用该指针作为参数传递给函数。 |
| [IDisposable](./idisposable/) | 定义一个方法，释放当前对象拥有的资源。此类的对象只能使用 [System::MakeObject()](./makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](./smartptr/) 指针中，并使用该指针作为参数传递给函数。 |
| [IEquatable](./iequatable/) | 定义一个方法，确定两个对象的相等性。此类的对象只能使用 [System::MakeObject()](./makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](./smartptr/) 指针中，并使用该指针作为参数传递给函数。 |
| [IFormatProvider](./iformatprovider/) | 定义一个方法，提供格式化信息。此类的对象只能使用 [System::MakeObject()](./makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](./smartptr/) 指针中，并使用该指针作为参数传递给函数。 |
| [IFormattable](./iformattable/) | 定义一个方法，使用指定的格式字符串和格式提供程序对当前对象的值进行格式化。 |
| [Int16](./int16/) | 包含用于处理 16 位整数的方法。 |
| [Int32](./int32/) | 包含用于处理 32 位整数的方法。 |
| [Int64](./int64/) | 包含用于处理 64 位整数的方法。 |
| [LockContext](./lockcontext/) | 实现 C# lock() 语句的守护对象。 |
| [MarshalByRefObject](./marshalbyrefobject/) | 在启用远程的应用程序中提供跨应用程序域边界访问对象的功能。此类的对象只能使用 [System::MakeObject()](./makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](./smartptr/) 指针中，并使用该指针作为参数传递给函数。 |
| [MulticastDelegate< ReturnType(ArgumentTypes...)>](./multicastdelegate_returntype(argumenttypes...)_/) | 表示委托的集合。此类型应在栈上分配，并通过值或引用传递给函数。切勿使用 [System::SmartPtr](./smartptr/) 类来管理此类型的对象。 |
| [Nullable](./nullable/) | 前向声明。 |
| [NullableUtils](./nullableutils/) | 表示 C# 的 [System.Nullable](./nullable/)（无类型参数）静态类。由于 C++ 中无法对类模板进行重载，无法使用原始名称。支持可以赋值为 null 的值类型。此类不可被继承。 |
| [Object](./object/) | 基类，使得在 C# 中可使用 [System.Object](./object/) 类的可用方法。所有在翻译环境中使用的非平凡类都应继承它。 |
| [ObjectExt](./objectext/) | 提供静态方法，模拟针对非 Object 的 C++ 类型（字符串、数字等）调用的 C# [Object](./object/) 方法。这是一个没有实例服务的静态类型。无论何种方式都不应创建其实例。 |
| [ObjectType](./objecttype/) | 提供实现对象类型获取器的静态方法。这是一个没有实例服务的静态类型。无论何种方式都不应创建其实例。 |
| [OperatingSystem](./operatingsystem/) | 表示特定的操作系统并提供有关它的信息。此类的对象只能使用 [System::MakeObject()](./makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](./smartptr/) 指针中，并使用该指针将其作为参数传递给函数。 |
| [Random](./random/) | 表示一个伪随机数生成器。此类的对象只能使用 [System::MakeObject()](./makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](./smartptr/) 指针中，并使用该指针将其作为参数传递给函数。 |
| [ReadOnlySpan](./readonlyspan/) | 用于在 [Span](./span/) 类中使用的转发。 |
| [ScopedCulture](./scopedculture/) | 表示在作用域内使用的区域性。 |
| [SmartPtr](./smartptr/) | 用于包装在堆上分配的类型的指针类。使用它来管理继承自 [Object](./object/) 的类的内存。此指针类型遵循侵入式指针语义。引用计数要么存储在 [Object](./object/) 本身，要么存储在与 [Object](./object/) 实例紧密绑定的计数结构中。无论如何，所有 [SmartPtr](./smartptr/) 实例都会形成单一所有权组，区别于 std::shared_ptr 类的行为。将原始指针转换为 [SmartPtr](./smartptr/) 是安全的，只要还有其他 [SmartPtr](./smartptr/) 实例持有对同一对象的共享引用。[SmartPtr](./smartptr/) 类实例可以处于两种状态之一：共享指针和弱指针。为了保持对象存活，必须保证对其的共享引用计数为正。弱指针和共享指针都可以用于访问指向的对象（调用方法、读取或写入字段等），但弱指针不参与共享指针的引用计数。当最后一个“共享” [SmartPtr](./smartptr/) 指针被销毁时，[Object](./object/) 将被删除。因此，请确保在不存在其他共享 [SmartPtr](./smartptr/) 指针时不要发生这种情况，例如在对象构造或析构期间。使用 System::Object::ThisProtector 哨兵对象（在 C++ 代码中）或 CppCTORSelfReference、CppSelfReference 属性（在 C# 代码中）来修复此问题。同样，请通过使用 [System::WeakPtr](./weakptr/) 指针类或 [System::SmartPtrMode::Weak](./smartptrmode/) 指针模式（在 C++ 代码中）或 CppWeakPtr 属性（在 C# 代码中）来打破循环引用。如果两个或更多对象使用“共享”指针相互引用，它们将永远不会被删除。如果需要在运行时切换指针类型（弱或共享），请使用 [System::SmartPtr<T>::set_Mode()](./smartptr/set_mode/) 方法或 [System::DynamicWeakPtr](./dynamicweakptr/) 类。[SmartPtr](./smartptr/) 类不包含任何虚方法。只有在创建自己的内存管理策略时才应继承它。此类型是用于管理其他对象删除的指针。它应在栈上分配，并通过值或 const 引用传递给函数。 |
| [SmartPtrInfo](./smartptrinfo/) | 用于在不知道最终类型的情况下测试和修改 [SmartPtr](./smartptr/) 内容的服务类。用于垃圾回收和循环引用检测等。可以将其视为“指向指针的指针”。由于 [SmartPtr](./smartptr/) 没有基类型，我们无法使用其基类型；因此使用此 “info” 类。 |
| [Span](./span/) | 表示类似于 C++20 的 std::span 的任意内存的连续区域。 |
| [String](./string/) | [String](./string/) 类在整个库中使用。是翻译代码时 C# [System.String](./string/) 的替代品。出于优化考虑，它不被视为 [Object](./object/) 的子类。此类型应在栈上分配，并通过值或引用传递给函数。切勿使用 [System::SmartPtr](./smartptr/) 类来管理此类型的对象。 |
| [StringComparer](./stringcomparer/) | 使用不同的比较模式比较字符串。此类的对象只能使用 [System::MakeObject()](./makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](./smartptr/) 指针中，并使用该指针将其作为参数传递给函数。 |
| [StringHashCompiletime](./stringhashcompiletime/) | 从 C 字符串生成哈希值的辅助类。 |
| [TimeSpan](./timespan/) | 表示时间间隔。此类型应在栈上分配，并通过值或引用传递给函数。切勿使用 [System::SmartPtr](./smartptr/) 类来管理此类型的对象。 |
| [TimeZone](./timezone/) | 表示时区。此类的对象只能使用 [System::MakeObject()](./makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](./smartptr/) 指针中，并使用该指针将其作为参数传递给函数。 |
| [TimeZoneInfo](./timezoneinfo/) | 表示描述特定时区的信息。此类的对象只能使用 [System::MakeObject()](./makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](./smartptr/) 指针中，并使用该指针将其作为参数传递给函数。 |
| [Tuple](./tuple/) | 表示元组数据结构的类。最大项数为 8。 |
| [TupleFactory](./tuplefactory/) | 提供用于创建元组对象的静态方法。 |
| [TypeInfo](./typeinfo/) | 表示特定类型并提供有关它的信息。 |
| [Uri](./uri/) | 统一资源标识符。此类的对象只能使用 [System::MakeObject()](./makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](./smartptr/) 指针中，并使用该指针将其作为参数传递给函数。 |
| [UriBuilder](./uribuilder/) | 提供构造和修改通用资源标识符（URI）的方法。此类的对象只能使用 [System::MakeObject()](./makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](./smartptr/) 指针中，并使用该指针将其作为参数传递给函数。 |
| [UriParser](./uriparser/) | 用于解析新的 URI 方案。此类的对象只能使用 [System::MakeObject()](./makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](./smartptr/) 指针中，并使用该指针将其作为参数传递给函数。 |
| [UriShim](./urishim/) | 服务类。 |
| [ValueTuple](./valuetuple/) | 表示 [ValueTuple](./valuetuple/) 数据结构的类。 |
| [ValueType](./valuetype/) | 为出于性能原因截断了 [Object](./object/) 继承的值类型提供的基类。此类型应在栈上分配，并通过值或引用传递给函数。切勿使用 [System::SmartPtr](./smartptr/) 类来管理此类型的对象。 |
| [Version](./version/) | 表示版本号。此类型应在栈上分配，并通过值或引用传递给函数。切勿使用 [System::SmartPtr](./smartptr/) 类来管理此类型的对象。 |
| [Void](./void/) |  |
| [WeakPtr](./weakptr/) | [System::SmartPtr](./smartptr/) 的子类，在构造时将自身设置为弱模式。请注意，此类并不保证其实例始终保持在弱模式，因为仍可访问 [set_Mode()](./smartptr/set_mode/)。此类型是用于管理其他对象删除的指针。它应在栈上分配，并通过值或 const 引用传递给函数。 |
| [WeakReference](./weakreference/) | 表示弱引用，它在引用对象的同时仍允许该对象被删除。 |
| [WeakReference< T >](./weakreference_t_/) | 表示弱引用，它在引用对象的同时仍允许该对象被删除。 |
| [WeakReference<>](./weakreference__/) | 表示弱引用，它在引用对象的同时仍允许该对象被删除。 |
## Enums

| 枚举 | 描述 |
| --- | --- |
| [Base64FormattingOptions](./base64formattingoptions/) | 枚举包含表示不同 Base-64 编码数据格式的值。 |
| [DateTimeKind](./datetimekind/) | 枚举值表示日期和时间的种类。 |
| [DayOfWeek](./dayofweek/) | 枚举表示一周的某天。 |
| [EnvironmentVariableTarget](./environmentvariabletarget/) | 指定环境变量的位置。 |
| [MidpointRounding](./midpointrounding/) | 指定四舍五入函数的行为。 |
| [PlatformID](./platformid/) | 表示操作系统平台。 |
| [SmartPtrMode](./smartptrmode/) | [SmartPtr](./smartptr/) 指针类型：弱引用或共享。定义在决定是否删除对象时指针是否被计数。 |
| [StringComparison](./stringcomparison/) | 定义字符串比较方式。 |
| [StringSplitOptions](./stringsplitoptions/) | 确定字符串分割行为。 |
| [TypeCode](./typecode/) | 表示对象的类型。 |
| [UriComponents](./uricomponents/) | 表示 URI 组件。 |
| [UriFormat](./uriformat/) | 指定 URI 的转义方式。 |
| [UriHostNameType](./urihostnametype/) | 表示主机名的类型。 |
| [UriKind](./urikind/) | 表示 URI 的种类。 |
| [UriPartial](./uripartial/) | 表示用于 [Uri.GetLeftPart](./uri/getleftpart/) 方法的 URI 部分。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [Action](./action/) | 委托类型，引用没有返回值的方法。 |
| [ArrayPtr](./arrayptr/) | ‘指向数组’类型的别名。 |
| [AsyncCallback](./asynccallback/) | 委托类型，表示异步操作完成时要调用的方法。 |
| [BadImageFormatException](./badimageformatexception/) | 当动态链接库 (DLL) 或可执行程序的文件映像无效时抛出的异常。切勿将 [BadImageFormatException](./badimageformatexception/) 类实例包装到 [System::SmartPtr](./smartptr/) 中。 |
| [ByteArrayPtr](./bytearrayptr/) | 指向无符号 8 位整数数组的智能指针对象的别名。 |
| [Converter](./converter/) | 表示指向可调用实体的指针，该实体接受 **TInput** 类型的单一参数并返回 **TOutput** 类型的值。 |
| [DecoderFallbackBufferPtr](./decoderfallbackbufferptr/) | 指向 [System::Text::DecoderFallbackBuffer](../system.text/decoderfallbackbuffer/) 类实例的智能指针的别名。 |
| [DecoderFallbackPtr](./decoderfallbackptr/) | 指向 [System::Text::DecoderFallback](../system.text/decoderfallback/) 类实例的智能指针的别名。 |
| [DecoderPtr](./decoderptr/) | 指向 [System::Text::Decoder](../system.text/decoder/) 类实例的智能指针的别名。 |
| [DecoderReplacementFallbackPtr](./decoderreplacementfallbackptr/) | 指向 [System::Text::DecoderReplacementFallback](../system.text/decoderreplacementfallback/) 类实例的智能指针的别名。 |
| [DirectoryInfoPtr](./directoryinfoptr/) | 一个别名，用于指向 [System::IO::DirectoryInfo](../system.io/directoryinfo/) 类实例的智能指针。 |
| [EncoderFallbackBufferPtr](./encoderfallbackbufferptr/) | 一个别名，用于指向 [System::Text::EncoderFallbackBuffer](../system.text/encoderfallbackbuffer/) 类实例的智能指针。 |
| [EncoderFallbackPtr](./encoderfallbackptr/) | 一个别名，用于指向 [System::Text::EncoderFallback](../system.text/encoderfallback/) 类实例的智能指针。 |
| [EncoderPtr](./encoderptr/) | 一个别名，用于指向 [System::Text::Encoder](../system.text/encoder/) 类实例的智能指针。 |
| [EncoderReplacementFallbackBufferPtr](./encoderreplacementfallbackbufferptr/) | 一个别名，用于指向 [System::Text::EncoderReplacementFallbackBuffer](../system.text/encoderreplacementfallbackbuffer/) 类实例的智能指针。 |
| [EncoderReplacementFallbackPtr](./encoderreplacementfallbackptr/) | 一个别名，用于指向 [System::Text::EncoderReplacementFallback](../system.text/encoderreplacementfallback/) 类实例的智能指针。 |
| [EncodingInfoPtr](./encodinginfoptr/) | 一个别名，用于指向 [System::Text::EncodingInfo](../system.text/encodinginfo/) 类实例的智能指针。 |
| [EncodingPtr](./encodingptr/) | 一个别名，用于指向 [System::Text::Encoding](../system.text/encoding/) 类实例的智能指针。 |
| [Event](./event/) | 表示一个事件——一种机制，通过委托调用向订阅者通知感兴趣的事件发生。 |
| [EventArgsPtr](./eventargsptr/) | 指向 [EventArgs](./eventargs/) 类实例的共享指针。 |
| [EventHandler](./eventhandler/) | 表示一个对事件作出响应并处理的函数。此类型应在栈上分配，并通过值或引用传递给函数。切勿使用 [System::SmartPtr](./smartptr/) 类来管理此类型的对象。 |
| [Exception](./exception/) | 用于替代 Details::Exception 的别名。 |
| [ExceptionPtr](./exceptionptr/) | 异常包装器使用的类型别名。 |
| [FileInfoPtr](./fileinfoptr/) | 一个别名，用于指向 [System::IO::FileInfo](../system.io/fileinfo/) 类实例的智能指针。 |
| [FileStreamPtr](./filestreamptr/) | 一个别名，用于指向 [System::IO::FileStream](../system.io/filestream/) 类实例的智能指针。 |
| [FileSystemInfoPtr](./filesysteminfoptr/) | 一个别名，用于指向 [System::IO::FileSystemInfo](../system.io/filesysteminfo/) 类实例的智能指针。 |
| [FunctionPtr](./functionptr/) | 具有默认调用约定的函数类型别名。 |
| [IAsyncResultPtr](./iasyncresultptr/) | 指向 [IAsyncResult](./iasyncresult/) 的共享指针。 |
| [IFormatProviderPtr](./iformatproviderptr/) | 一个别名，用于指向 [System::IFormatProvider](./iformatprovider/) 类实例的智能指针。 |
| [MakeConstRef_t](./makeconstref_t/) | 用于 [MakeConstRef](./makeconstref/) 修饰符的辅助类型。 |
| [MemoryStreamPtr](./memorystreamptr/) | 一个别名，用于指向 [System::IO::MemoryStream](../system.io/memorystream/) 类实例的智能指针。 |
| [Predicate](./predicate/) | 表示指向谓词的指针——一种可调用实体，接受单个参数并返回布尔值。 |
| [RTaskPtr](./rtaskptr/) | 一个别名，用于指向 [System::Threading::Tasks::ResultTask](../system.threading.tasks/resulttask/) 类实例的智能指针。 |
| [SharedPtr](./sharedptr/) | 库中广泛使用的智能指针别名。 |
| [StreamPtr](./streamptr/) | 一个别名，用于指向 [System::IO::Stream](../system.io/stream/) 类实例的智能指针。 |
| [StreamReaderPtr](./streamreaderptr/) | 一个别名，表示指向 [System::IO::StreamReader](../system.io/streamreader/) 类实例的智能指针。 |
| [StreamWriterPtr](./streamwriterptr/) | 一个别名，表示指向 [System::IO::StreamWriter](../system.io/streamwriter/) 类实例的智能指针。 |
| [StringComparerPtr](./stringcomparerptr/) | 一个别名，表示指向 [StringComparer](./stringcomparer/) 类实例的共享指针。 |
| [TaskPtr](./taskptr/) | 一个别名，表示指向 [System::Threading::Tasks::Task](../system.threading.tasks/task/) 类实例的智能指针。 |
| [TimeZoneInfoPtr](./timezoneinfoptr/) | 别名，表示指向 [TimeZoneInfo](./timezoneinfo/) 类实例的共享指针。 |
| [TimeZonePtr](./timezoneptr/) | 指向 [TimeZone](./timezone/) 类实例的共享指针。 |
## Functions

| 函数 | 描述 |
| --- | --- |
| AsCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| AsCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| AsCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| AsCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| AsCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| AsCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| AsCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| AsCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| AsCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| AsCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| AsCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| AsCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| AsCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| AsCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| AsCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Build | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| BuildArray | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| BuildObject | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Cast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Cast_noexcept | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| CastEnumerableTo | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| CastEnumerableTo | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| CheckedCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Compare | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Compare | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| const_pointer_cast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| ConstCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Default | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Default | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Discard | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| DoTryFinally | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| DoTryFinally | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| DoTryFinally | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| dynamic_pointer_cast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| DynamicCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| DynamicCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| DynamicCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| DynamicCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| DynamicCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| DynamicCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| DynamicCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| DynamicCast_noexcept | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| DynamicCast_noexcept | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| DynamicCast_noexcept | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| DynamicCastArray | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| EnumGetName | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| EnumGetName | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| 等于 | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| 等于< double, double > | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| 等于< float, float > | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| 显式转换 | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| 显式转换 | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| 显式转换 | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| 显式转换 | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| 显式转换 | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| 显式转换 | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| 显式转换 | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| 显式转换 | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| 显式转换 | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| 显式转换 | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| 显式转换 | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| 显式转换 | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| 显式转换 | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| 显式转换 | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| 显式转换 | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| 显式转换 | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| 显式转换 | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| 显式转换 | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| 显式转换 | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| 强制静态转换 | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| 遍历每个成员GV名称 | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| 大于等于 | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| 获取 | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| 获取 | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| 获取 | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| 获取 | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| 获取指针 | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| 获取哈希码 | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| 获取哈希码 | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| 获取哈希码 | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| 获取哈希码 | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| 获取哈希码 | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| 大于 | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| 初始化对象 | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| 是 | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| 是 | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| 是 | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| 是参数化测试 | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| 是vp测试 | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| 已定义枚举元信息 | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| 已定义枚举元信息 | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| 是无穷大 | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| 是非数字 | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| 是负无穷大 | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| 是正无穷大 | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| 是元组 | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| 遍历 | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| 遍历 | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| 遍历 | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| 遍历 | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| 遍历 | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| 遍历 | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| 遍历 | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| 小于等于 | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| 小于 | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| 创建数组 | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| 创建数组 | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| 创建数组 | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| MakeAsync | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| MakeAsync | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| MakeObject | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| MakeObject | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| MakeScopeGuard | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| MakeSharedPtr | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| MakeSharedPtr | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| MakeTuple | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| MakeValueAsync | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| MakeValueAsync | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| MakeYieldEnumerable | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| MakeYieldEnumerator | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| MemberwiseClone | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| ObjectType::GetType< System::DateTime > | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| ObjectType::GetType< System::String > | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator!= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator!= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator!= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator!= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator!= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator!= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator!= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator!= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator!= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator!= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator!= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator!= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator!= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator!= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator!= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator!= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator* | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator+ | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator+ | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator+ | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator+ | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator+ | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator+ | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator- | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator- | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator- | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator- | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator/ | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator> | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator> | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator> | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator> | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator> | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator>= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator>= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator>= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator>= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator>= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator>> | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator>> | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| PrintTo | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| PrintTo | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| PrintTo | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| PrintTo | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| PrintTo | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| PrintTo | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| PrintTo | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| PrintTo | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| PrintTo | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| PrintTo | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| PrintTo | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| PrintTo | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| PrintTo | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Ref | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Ref | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Ref | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| SafeInvoke | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Set | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| setter_decrement_wrap | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| setter_decrement_wrap | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| setter_decrement_wrap | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| setter_increment_wrap | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| setter_increment_wrap | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| setter_post_decrement_wrap | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| setter_post_decrement_wrap | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| setter_post_decrement_wrap | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| setter_post_increment_wrap | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| setter_post_increment_wrap | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| setter_post_increment_wrap | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| setter_wrap | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| setter_wrap | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| static_pointer_cast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| StaticCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| StaticCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| StaticCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| StaticCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| StaticCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| StaticCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| StaticCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| StaticCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| StaticCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| StaticCast_noexcept | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| StaticCast_noexcept | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| StaticCast_noexcept | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| StaticCast_noexcept | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| StaticCastArray | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| StaticCastArray | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| TieTuple | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| 使用 | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| 使用 | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
