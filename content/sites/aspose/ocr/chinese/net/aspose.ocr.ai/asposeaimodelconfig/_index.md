---
title: AsposeAIModelConfig
second_title: Aspose.OCR 适用于 .NET API 参考
description: 表示加载 LLM 模型的配置设置。
type: docs
weight: 570
url: /zh/net/aspose.ocr.ai/asposeaimodelconfig/
---
## AsposeAIModelConfig class

表示加载 LLM 模型的配置设置。

```csharp
public class AsposeAIModelConfig
```

## 构造函数

| 名称 | 描述 |
| --- | --- |
| [AsposeAIModelConfig](asposeaimodelconfig)() | 默认构造函数。 |

## 属性

| 名称 | 描述 |
| --- | --- |
| [AllowAutoDownload](../../aspose.ocr.ai/asposeaimodelconfig/allowautodownload) { get; set; } | 如果为 true，则在本地不存在时模型将自动下载。 |
| [ContextSize](../../aspose.ocr.ai/asposeaimodelconfig/contextsize) { get; set; } | 定义 LLM 在推理期间可用作上下文的最大 token 数量。如果为 null，将使用模型定义的默认上下文大小。更大的值允许模型考虑更多文本，但可能需要更多内存。 |
| [DirectoryModelPath](../../aspose.ocr.ai/asposeaimodelconfig/directorymodelpath) { get; set; } | 可选的路径，用于缓存已下载或已处理的模型。如果未设置，将使用默认系统位置。 |
| [FileModelPath](../../aspose.ocr.ai/asposeaimodelconfig/filemodelpath) { get; set; } | 本地路径，指向包含模型文件的文件夹。如果指定，将使用该路径而不是下载。默认为空。 |
| [GpuLayers](../../aspose.ocr.ai/asposeaimodelconfig/gpulayers) { get; set; } | 模型使用的 GPU 层数。如果未指定，将使用默认值（40）。设置为 0 则完全在 CPU 上运行。 |
| [HuggingFaceFileName](../../aspose.ocr.ai/asposeaimodelconfig/huggingfacefilename) { get; set; } | 从 HuggingFace 下载时可选的模型名称。例如："TableGPT2-7B.Q4_K_S.gguf"。表格 AI 的默认值为 TableGPT2-7B.Q4_K_S.gguf。 |
| [HuggingFaceRepoId](../../aspose.ocr.ai/asposeaimodelconfig/huggingfacerepoid) { get; set; } | HuggingFace 上模型的 ID（例如 "openai/gpt2"）。如果指定，将从 HuggingFace 下载模型。默认值为 bartowski/Qwen2.5-3B-Instruct-GGUF。 |

### 另请参见

* namespace [Aspose.OCR.AI](../../aspose.ocr.ai)
* assembly [Aspose.OCR](../../)

<!-- 请勿编辑：由 xmldocmd 为 Aspose.OCR.dll 生成 -->
