---
title: AsposeAI
second_title: Aspose.OCR 适用于 .NET API 参考
description: Aspose OCR 库中 AI 组件的主要 API。提供与 AI 驱动的后处理器（如拼写检查、表格提取和布局校正）的集成。
type: docs
weight: 620
url: /zh/net/aspose.ocr.ai/asposeai/
---
## AsposeAI class

Aspose OCR 库中 AI 组件的主要 API。提供与 AI 驱动的后处理器（如拼写检查、表格提取和布局校正）的集成。

```csharp
public class AsposeAI : IDisposable
```

## 构造函数

| 名称 | 描述 |
| --- | --- |
| [AsposeAI](asposeai#constructor)() | 使用默认设置初始化 AsposeAI 类的新实例。已启用自动模型下载。 |
| [AsposeAI](asposeai#constructor_1)(ILogger) | 使用自定义日志记录器初始化 AsposeAI 类的新实例。已启用自动模型下载。 |

## 方法

| 名称 | 描述 |
| --- | --- |
| [Dispose](../../aspose.ocr.ai/asposeai/dispose)() | 释放 AsposeAI 实例使用的内部资源。 |
| [FreeResources](../../aspose.ocr.ai/asposeai/freeresources)() | 释放所有 AI 相关资源并处理已加载的模型。 |
| [GetLocalPath](../../aspose.ocr.ai/asposeai/getlocalpath)() | 获取当前配置的本地模型目录路径。 |
| [IsInitialized](../../aspose.ocr.ai/asposeai/isinitialized)() | 检查 AI 引擎是否已初始化。 |
| [ListLocal](../../aspose.ocr.ai/asposeai/listlocal)() | 列出配置目录中可用的所有本地模型。 |
| [RunPostprocessor](../../aspose.ocr.ai/asposeai/runpostprocessor#runpostprocessor_1)(List&lt;string&gt;) | 将已注册的 AI 后处理器应用于识别文本字符串列表。 |
| [RunPostprocessor](../../aspose.ocr.ai/asposeai/runpostprocessor#runpostprocessor)(OcrOutput) | 将已注册的 AI 后处理器应用于给定的结构化 OCR 结果。这可能包括拼写纠正、表格检测、表格格式化以及其他基于 AI 的增强功能，具体取决于已配置的处理器。 |
| [SetPostProcessor](../../aspose.ocr.ai/asposeai/setpostprocessor)(IOcrAIPostProcessor, AsposeAIModelConfig) | 添加一个将在 OCR 结果上应用的 AI 后处理器。如果提供了 *customSettings*，将在应用后处理器之前自动加载并配置指定的或默认的 AI 模型。 |

### 备注

⚠️ **免责声明:** 使用 AI 驱动的功能时，您自行负责确保遵守所有适用的法律、许可条款、第三方 AI 模型使用政策以及数据隐私法规。Aspose 不对外部 AI 模型的准确性、许可或可靠性承担责任。

### 另请参见

* namespace [Aspose.OCR.AI](../../aspose.ocr.ai)
* assembly [Aspose.OCR](../../)

<!-- 请勿编辑：由 xmldocmd 为 Aspose.OCR.dll 生成 -->
