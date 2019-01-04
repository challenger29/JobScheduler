package com.target.queuing;

import java.util.List;
import java.util.Queue;

import com.target.model.Job;

public interface QueuingAlgorithm {
	public List<Job> getQueuingSequence(Queue<Job> queue);
}
