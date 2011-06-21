package mia.clustering.ch12;

import mia.clustering.ch12.twitter.ByKeyGroupingJob;

import org.apache.commons.codec.language.DoubleMetaphone;
import org.apache.mahout.common.Parameters;

public class CreateTwitterUserDataset {
  public static void main(String args[]) throws Exception {
    Parameters params = new Parameters();
    params.set("splitPattern", "\t");
    String inputDir = "infochimps_five-days-of-25bahman-tweets/tweets_25bahman.csv";
    String outputDir = "twitter_seqfiles";
    params.set("input", inputDir);
    params.set("output", outputDir);
    params.set("selectedField", "3"); // tweet
    params.set("groupByField", "2"); // username
    ByKeyGroupingJob.startJob(params);
    DoubleMetaphone filter = new DoubleMetaphone();
    // TODO: change these terms?!
    System.out.println(filter.encode("Loke"));
    System.out.println(filter.encode("companymancomic"));
    System.out.println(filter.encode("webcomics"));
    System.out.println(filter.encode("@comic"));
  }
}
