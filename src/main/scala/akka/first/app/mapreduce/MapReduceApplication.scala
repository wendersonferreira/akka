package akka.first.app.mapreduce

import scala.collection.mutable.ArrayBuffer

sealed trait MapReduceMessage

case class WordCount(word: String, count: Int) extends MapReduceMessage

case class MapData(dataList: ArrayBuffer[WordCount]) extends MapReduceMessage

case class ReducedData(reducedDataMap: Map[String, Int]) extends MapReduceMessage

case class Result() extends MapReduceMessage


class MapReduceApplication {

}
