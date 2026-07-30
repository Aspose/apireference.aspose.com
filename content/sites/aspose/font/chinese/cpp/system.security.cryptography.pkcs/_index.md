---
title: "System::Security::Cryptography::Pkcs 命名空间"
linktitle: "System::Security::Cryptography::Pkcs"
second_title: "Aspose.Font 适用于 C++"
description: "如何在 C++ 中使用 System::Security::Cryptography::Pkcs 命名空间。"
type: docs
weight: 6100
url: /zh/cpp/system.security.cryptography.pkcs/
---



## 类

| 类 | 描述 |
| --- | --- |
| [CmsSigner](./cmssigner/) | 提供使用 CMS 对对象进行签名的 API。它本身不执行签名，请使用 SignedCMS 类实现。未实现。此类的对象只能使用 [System::MakeObject()](../system/makeobject/) 函数分配。切勿在栈上或使用 new 操作符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。 |
| [ContentInfo](./contentinfo/) | 内容信息，遵循 CMS/PKCS #7 标准定义。未实现。此类的对象只能使用 [System::MakeObject()](../system/makeobject/) 函数分配。切勿在栈上或使用 new 操作符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。 |
| [SignedCms](./signedcms/) | 根据 CMS/PKCS #7 标准对内容进行签名。未实现。此类的对象只能使用 [System::MakeObject()](../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。 |
