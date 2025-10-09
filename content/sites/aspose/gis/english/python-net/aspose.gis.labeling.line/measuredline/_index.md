---
title: MeasuredLine Class
type: docs
weight: 60
url: /python-net/aspose.gis.labeling.line/measuredline/
---

**Summary:** 

**Module:** [aspose.gis.labeling.line](/psd/python-net/aspose.gis.labeling.line/)

**Full Name:** aspose.gis.labeling.line.MeasuredLine

**Aspose.PSD Version:** 25.9.0

## **Constructors**
| **Name** | **Description** |
| :- | :- |
| [MeasuredLine(line)](#MeasuredLine_line_1) | Initializes a new instance of the MeasuredLine class |
## **Properties**
| **Name** | **Type** | **Access** | **Description** |
| :- | :- | :- | :- |
| distance_to_segment | System.Collections.Generic.IReadOnlyList<double> | r |    |
| is_closed | bool | r |    |
| line | System.Collections.Generic.IReadOnlyList<Aspose.Gis.Common.Coordinate> | r |    |
| middle_of_line | double | r |    |
| segment_lengths | System.Collections.Generic.IReadOnlyList<double> | r |    |
| total_line_length | double | r |    |
## **Methods**
| **Name** | **Description** |
| :- | :- |
| [get_point_by_distance(distance_along_line)](#get_point_by_distance_distance_along_line_1) |    |
| [get_segment_index(distance_along_line)](#get_segment_index_distance_along_line_2) |    |


### Constructor: MeasuredLine(line) {#MeasuredLine_line_1}


```
 MeasuredLine(line) 
```

Initializes a new instance of the MeasuredLine class

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| line | System.Collections.Generic.IReadOnlyList<Aspose.Gis.Common.Coordinate> |  |

### Method: get_point_by_distance(distance_along_line) {#get_point_by_distance_distance_along_line_1}


```
 get_point_by_distance(distance_along_line) 
```

  

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| distance_along_line | double |  |

**Returns**

| Type | Description |
| :- | :- |
| [Coordinate](/psd/python-net/aspose.gis.common/coordinate/) |  |


### Method: get_segment_index(distance_along_line) {#get_segment_index_distance_along_line_2}


```
 get_segment_index(distance_along_line) 
```

  

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| distance_along_line | double |  |

**Returns**

| Type | Description |
| :- | :- |
| int |  |


