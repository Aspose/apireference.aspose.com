---
title: InterruptMonitor صف
second_title: Aspose.Cells for Python via .NET API المراجع
description:
type: docs
weight: 990
url: /ar/aspose.cells/interruptmonitor/
is_root: false
---
##  InterruptMonitor صف
يمثل كل عامل حول المقاطعة.



**ميراث:** [`InterruptMonitor`](/cells/python-net/aspose.cells/interruptmonitor) → 
[`AbstractInterruptMonitor`](/cells/python-net/ar/aspose.cells/abstractinterruptmonitor)



يكشف النوع InterruptMonitor عن الأعضاء التاليين:

###  البنائين
| البناء| وصف|
| :- | :- |
| [__init__](/cells/python-net/ar/aspose.cells/interruptmonitor/__init__/#) | إنشاء مثيل جديد لـ InterruptMonitor|


###  ملكيات
| ملكية| وصف|
| :- | :- |
| [is_interruption_requested](/cells/python-net/ar/aspose.cells/interruptmonitor/is_interruption_requested) | ضع علامة على الشاشة على أنها تطلب المقاطعة|
| [terminate_without_exception](/cells/python-net/ar/aspose.cells/interruptmonitor/terminate_without_exception) | عند مقاطعة الإجراء، سواء قم بإنهاء الإجراء بهدوء أو قم بطرح استثناء.<br/>الافتراضي خطأ، أي عندما يكون [`AbstractInterruptMonitor.is_interruption_requested`](/cells/python-net/ar/aspose.cells/abstractinterruptmonitor#is_interruption_requested) صحيحًا،<br/> سيتم طرح [`CellsException`](/cells/python-net/ar/aspose.cells/cellsexception) برمز [`ExceptionType.INTERRUPTED`](/cells/python-net/ar/aspose.cells/exceptiontype#INTERRUPTED).|


###  طُرق
| طريقة| وصف|
| :- | :- |
| [interrupt](/cells/python-net/ar/aspose.cells/interruptmonitor/interrupt/#) | مقاطعة المشغل الحالي.|



###  أنظر أيضا
* الوحدة [`aspose.cells`](..)
* فئة [`AbstractInterruptMonitor`](/cells/python-net/ar/aspose.cells/abstractinterruptmonitor)
* فئة [`CellsException`](/cells/python-net/ar/aspose.cells/cellsexception)
* فئة [`InterruptMonitor`](/cells/python-net/ar/aspose.cells/interruptmonitor)
