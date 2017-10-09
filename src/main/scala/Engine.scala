package org.template.productranking

import org.apache.predictionio.controller.IEngineFactory
import org.apache.predictionio.controller.Engine

case class Query(
  user: String,
  items: List[String]
) extends Serializable

case class PredictedResult(
  itemScores: Array[ItemScore],
  isOriginal: Boolean // set to true if the items are not ranked at all.
) extends Serializable

case class ItemScore(
  item: String,
  score: Double
) extends Serializable

object ProductRankingEngine extends IEngineFactory {
  def apply() = {
    new Engine(
      classOf[DataSource],
      classOf[Preparator],
      Map("als" -> classOf[ALSAlgorithm]),
      classOf[Serving])
  }
}
